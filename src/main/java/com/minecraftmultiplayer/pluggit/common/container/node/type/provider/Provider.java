package com.minecraftmultiplayer.pluggit.common.container.node.type.provider;

import com.minecraftmultiplayer.pluggit.common.container.node.Node;
import com.minecraftmultiplayer.pluggit.common.container.node.type.module.Module;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Node.Config(
    version = "1.0",
    loader = Provider.Loader.class
)
public abstract class Provider<T extends Provider<T>> extends Node<Provider.Config, T>
{
    @Override
    public void unload()
    {

    }

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Config
    {
        Class<? extends Module> providedIn() default Module.class;
    }

    @Target(ElementType.ANNOTATION_TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Ref
    {
        Class<? extends Provider> value() default Provider.class;

        Prop[] props() default {};

        String version() default "";
    }

    static final class Loader extends Node.Loader<Provider<?>>
    {
        @Override
        public Provider<?> load()
        {
            return null;
        }
    }
}
