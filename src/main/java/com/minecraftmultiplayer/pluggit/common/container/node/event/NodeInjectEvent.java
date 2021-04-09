package com.minecraftmultiplayer.pluggit.common.container.node.event;

import com.minecraftmultiplayer.pluggit.common.container.node.Node;

@Node.Event.Config(name = "NODE_INJECT")
public final class NodeInjectEvent extends Node.Event<Node<?, ?>>
{
    @Override
    public String getName()
    {
        return "NODE_INJECT";
    }
}

