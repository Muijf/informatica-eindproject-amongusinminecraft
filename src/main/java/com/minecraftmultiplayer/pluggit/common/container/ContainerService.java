package com.minecraftmultiplayer.pluggit.common.container;

import com.google.common.collect.ImmutableList;
import com.minecraftmultiplayer.pluggit.common.container.node.type.provider.Provider;

import java.util.ArrayList;
import java.util.List;

public final class ContainerService extends Provider
{
    private final List<Container> containers = new ArrayList<>();

    public final ImmutableList<Container> getContainers()
    {
        return ImmutableList.copyOf(this.containers);
    }
}
