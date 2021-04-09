package com.minecraftmultiplayer.pluggit.common.container.node.type.controller;

import com.minecraftmultiplayer.pluggit.common.container.node.Node;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Node.Config(
    version = "1.0",
    loader = Controller.Loader.class
)
public abstract class Controller<T extends Controller<T>> extends Node<Controller.Config, T>
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
        Class<? extends Controller> value() default Controller.class;

        Prop[] props() default {};

        String version() default "";
    }

    static final class Loader extends Node.Loader<Controller<?>>
    {
        @Override
        public Controller<?> load()
        {
            return null;
        }
    }
}
