package com.minecraftmultiplayer.inventory.bukkit;

import com.minecraftmultiplayer.inventory.common.Inventory;
import com.minecraftmultiplayer.pluggit.common.container.node.Node;
import org.bukkit.inventory.ItemStack;

@Node.Config(
    version = "1.0"
)
public abstract class BukkitInventory extends Inventory<BukkitInventory>
{
    public abstract ItemStack[] getItems();
}
