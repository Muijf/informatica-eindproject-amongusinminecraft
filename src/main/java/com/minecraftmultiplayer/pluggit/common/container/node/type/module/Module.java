package com.minecraftmultiplayer.pluggit.common.container.node.type.module;

import com.minecraftmultiplayer.pluggit.common.container.node.Node;
import com.minecraftmultiplayer.pluggit.common.container.node.type.component.Component;
import com.minecraftmultiplayer.pluggit.common.container.node.type.controller.Controller;
import com.minecraftmultiplayer.pluggit.common.container.node.type.provider.Provider;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Node.Config(
    version = "1.0",
    loader = Module.Loader.class
)
public abstract class Module<T extends Module<T>> extends Node<Module.Config, T>
{
    @Override
    public void unload()
    {

    }

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Config
    {
        Ref[] modules() default {};

        Controller.Ref[] controllers() default {};

        Provider.Ref[] providers() default {};

        Component.Ref[] components() default {};
    }

    @Target(ElementType.ANNOTATION_TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Ref
    {
        Class<? extends Module> value() default Module.class;

        Prop[] props() default {};

        String version() default "";
    }

    static final class Loader extends Node.Loader<Module<?>>
    {
        @Override
        public Module<?> load()
        {
            return null;
        }
    }
}
