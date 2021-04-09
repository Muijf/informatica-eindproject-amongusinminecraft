package com.minecraftmultiplayer.pluggit.common.container.node.type.component;

import com.minecraftmultiplayer.pluggit.common.container.node.Node;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Node.Config(
    version = "1.0",
    loader = Component.Loader.class
)
public abstract class Component<T extends Component<T>> extends Node<Component.Config, T>
{
    @Override
    public void unload()
    {

    }

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Config
    {

    }

    @Target(ElementType.ANNOTATION_TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Ref
    {
        Class<? extends Component> value() default Component.class;

        Prop[] props() default {};

        String version() default "";
    }

    static final class Loader extends Node.Loader<Component<?>>
    {
        @Override
        public Component<?> load()
        {
            return null;
        }
    }
}
