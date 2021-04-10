package com.muijf.amongusinminecraft.ui.menu;

import com.muijf.amongusinminecraft.core.menu.Menu;
import com.muijf.amongusinminecraft.core.user.User;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class MainMenu extends Menu
{
    public MainMenu(final User user)
    {
        super(user);
    }

    @Override
    public String getName()
    {
        return "&c&lMain Menu";
    }

    @Override
    public Slot[] getSlots()
    {
        return new Slot[]{
            new Slot(0, new ItemStack(Material.ACACIA_BUTTON)),
            new Slot(3, new ItemStack(Material.WOODEN_AXE)),
            new Slot(5, new ItemStack(Material.STONE_SWORD))
        };
    }
}
