package com.muijf.amongusinminecraft.core.menu;

import com.minecraftmultiplayer.inventory.bukkit.BukkitInventory;
import com.minecraftmultiplayer.pluggit.common.container.node.Node;
import com.minecraftmultiplayer.pluggit.common.container.node.NodeService;
import com.minecraftmultiplayer.pluggit.common.container.node.event.NodeInjectEvent;
import com.muijf.amongusinminecraft.core.user.User;

@Node.Config(
    version = "1.0"
)
public abstract class Menu extends BukkitInventory
{
    private final User user;

    @Inject private MenuService menuService;
    @Inject private NodeService nodeService;

    public Menu(final User user)
    {
        this.user = user;
    }

    public final User getUser()
    {
        return this.user;
    }

    @On(NodeInjectEvent.class)
    public final void onInjected()
    {

    }
}
