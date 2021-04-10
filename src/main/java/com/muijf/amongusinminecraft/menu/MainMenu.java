package com.muijf.amongusinminecraft.menu;

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
    public ItemStack[] getItems()
    {
        return new ItemStack[]{
            new ItemStack(Material.ACACIA_BUTTON, 1),
            new ItemStack(Material.WOODEN_AXE, 1),
            new ItemStack(Material.STONE_SWORD, 1),
        };
    }
}
