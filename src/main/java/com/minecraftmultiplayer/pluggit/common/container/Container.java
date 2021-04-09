package com.minecraftmultiplayer.pluggit.common.container;

import com.google.common.collect.ImmutableList;
import com.minecraftmultiplayer.pluggit.common.container.node.Node;
import com.minecraftmultiplayer.pluggit.common.container.node.type.component.Component;
import com.minecraftmultiplayer.pluggit.common.container.node.type.module.Module;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public abstract class Container extends Component<Container>
{
    public final ImmutableList<? extends Node<?, ?>> getNodes()
    {
        return ImmutableList.of();
    }

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Config
    {
        Class<? extends Module<?>> rootModule();
    }
}