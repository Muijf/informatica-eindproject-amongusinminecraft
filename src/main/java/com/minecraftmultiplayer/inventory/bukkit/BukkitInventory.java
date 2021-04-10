package com.minecraftmultiplayer.inventory.bukkit;

import com.minecraftmultiplayer.inventory.common.Inventory;
import com.minecraftmultiplayer.pluggit.common.container.node.Node;
import org.bukkit.inventory.ItemStack;

@Node.Config(
    version = "1.0"
)
public abstract class BukkitInventory extends Inventory<BukkitInventory>
{
    public abstract String getName();

    public abstract Slot[] getSlots();

    public final static class Slot
    {
        private final int index;
        private final ItemStack item;

        public Slot(final int index, final ItemStack item)
        {
            this.index = index;
            this.item = item;
        }

        public int getIndex()
        {
            return this.index;
        }

        public ItemStack getItem()
        {
            return this.item;
        }
    }
}
