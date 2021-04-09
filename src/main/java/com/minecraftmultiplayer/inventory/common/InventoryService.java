package com.minecraftmultiplayer.inventory.common;

import com.google.common.collect.ImmutableList;
import com.minecraftmultiplayer.pluggit.common.container.node.Node;
import com.minecraftmultiplayer.pluggit.common.container.node.type.provider.Provider;

import java.util.*;

@Node.Config(
    version = "1.0"
)
public final class InventoryService extends Provider<InventoryService>
{
    private final Map<UUID, List<Inventory>> inventories = new IdentityHashMap<>();

    public ImmutableList<Inventory> getInventories()
    {
        final List<Inventory> tempList = new ArrayList<>();

        this.inventories.values().forEach(tempList::addAll);

        return ImmutableList.copyOf(tempList);
    }
}
