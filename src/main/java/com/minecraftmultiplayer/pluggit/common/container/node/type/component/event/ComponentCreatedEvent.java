package com.minecraftmultiplayer.pluggit.common.container.node.type.component.event;

import com.minecraftmultiplayer.pluggit.common.container.node.Node;
import com.minecraftmultiplayer.pluggit.common.container.node.type.component.Component;

@Node.Event.Config(name = "COMPONENT_CREATED")
public final class ComponentCreatedEvent extends Node.Event<Component<?>>
{
    @Override
    public String getName()
    {
        return "COMPONENT_CREATED";
    }
}
