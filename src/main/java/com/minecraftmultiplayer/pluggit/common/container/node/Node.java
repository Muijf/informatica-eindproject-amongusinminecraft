package com.minecraftmultiplayer.pluggit.common.container.node;

import com.google.common.collect.ImmutableList;
import com.minecraftmultiplayer.pluggit.common.container.Container;
import com.minecraftmultiplayer.pluggit.common.container.node.type.component.Component;

import java.io.Serializable;
import java.lang.annotation.*;
import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public abstract class Node<A extends Annotation, N extends Node<A, N>>
{
    public final Container getContainer()
    {
        return null;
    }

    public final ImmutableList<Node<?, ?>> getChildNodes()
    {
        return ImmutableList.of();
    }

    public final <E extends Event<?>> void on(final Class<E> event, final Consumer<E> consumer)
    {
        consumer.accept(null);
    }

    public final void on(final String event, final Consumer<Event<?>> consumer)
    {

    }

    public abstract void unload();

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Config
    {
        String version();

        Class<? extends Loader> loader() default Loader.class;

        Prop[] defaultProps() default {};
    }

    @Target(ElementType.ANNOTATION_TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Prop
    {
        String id();

        Class<?> classValue() default Class.class;

        String stringValue() default "";

        int intValue() default 0;
    }

    @Target({
        ElementType.PARAMETER,
        ElementType.FIELD
    })
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Inject
    {
        String value() default "";

        Class<? extends Container> container() default Container.class;
    }

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    protected @interface On
    {
        Class<? extends Event> value() default Event.class;

        Class<? extends Event> useClass() default Event.class;

        String useName() default "";

        @Hook.Handler.Config(use = On.class)
        final class Handler extends Hook.Handler<On>
        {
            private Handler() {}

            @Override
            public Class<On> getAnnotationType()
            {
                return On.class;
            }
        }
    }

    protected abstract static class Loader<T extends Node<?, ?>>
    {
        protected Loader() {}

        public abstract T load();
    }

    public final static class Builder<T extends Annotation, D extends Node<T, D>>
    {
        private final Map<String, Object> values = new HashMap<>();

        public Builder() {}

        public final <V> Builder<T, D> set(final State.Key<T, V> key, final V value)
        {
            this.values.put(key.getName(), value);
            return this;
        }

        public final D build()
        {
            return null;
        }
    }

    public static abstract class Event<N extends Node<?, ?>>
    {
        public abstract String getName();

        public final N getNode()
        {
            return null;
        }

        @Target(ElementType.TYPE)
        @Retention(RetentionPolicy.RUNTIME)
        public @interface Config
        {
            String name();
        }
    }

    public static final class Hook<T extends Annotation> extends Component<Hook<T>>
    {
        private final Handler<T> handler;

        private Hook(final Handler<T> handler)
        {
            this.handler = handler;
        }

        public static abstract class Handler<T extends Annotation>
        {
            final Node.Hook<T> createHook()
            {
                return new Node.Hook<>(this);
            }

            public abstract Class<T> getAnnotationType();

            @Target(ElementType.TYPE)
            @Retention(RetentionPolicy.RUNTIME)
            public @interface Config
            {
                Class<? extends Annotation> use();
            }
        }
    }

    protected final static class State<T extends Annotation>
    {
        private final Map<String, Object> values;

        private State(final Map<String, Object> defaultValues)
        {
            this.values = defaultValues;
        }

        @SuppressWarnings("unchecked")
        public final <K, V> V get(final Key<K, V> key)
        {
            return (V) this.values.get(key.getName());
        }

        public final <K, V> State<T> set(final Key<K, V> key, final V value)
        {
            this.values.put(key.getName(), value);
            return this;
        }

        @FunctionalInterface
        public interface Key<T, R> extends Serializable
        {
            R apply(T t);

            default String getName()
            {
                try
                {
                    final Method writeReplaceMethod = this.getClass().getDeclaredMethod("writeReplace");

                    writeReplaceMethod.setAccessible(true);

                    return ((SerializedLambda) writeReplaceMethod.invoke(this)).getImplMethodName();
                }
                catch(final Exception e)
                {
                    return null;
                }
            }
        }
    }
}
