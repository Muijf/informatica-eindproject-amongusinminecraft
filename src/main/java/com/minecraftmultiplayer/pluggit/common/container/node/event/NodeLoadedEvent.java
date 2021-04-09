package com.minecraftmultiplayer.pluggit.common.container.node.event;

import com.minecraftmultiplayer.pluggit.common.container.node.Node;

@Node.Event.Config(name = "NODE_LOADED")
public final class NodeLoadedEvent extends Node.Event<Node<?, ?>>
{
    @Override
    public String getName()
    {
        return "NODE_LOADED";
    }
}
