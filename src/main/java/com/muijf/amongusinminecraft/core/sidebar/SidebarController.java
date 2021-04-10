package com.muijf.amongusinminecraft.core.sidebar;

import com.minecraftmultiplayer.commands.bukkit.hook.OnCommand;
import com.minecraftmultiplayer.events.bukkit.hook.OnEvent;
import com.minecraftmultiplayer.pluggit.common.container.node.type.controller.Controller;
import org.bukkit.entity.Player;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.UUID;

public final class SidebarController extends Controller<SidebarController>
{
    @Inject
    private SidebarService sidebarService;

    @OnCommand("/sidebar toggle")
    public void toggleSidebar(@Inject final Player player)
    {
        final UUID uniqueId = player.getUniqueId();

        if(this.sidebarService.hasSidebar(uniqueId))
        {
            this.sidebarService.getSidebar(uniqueId)
                .toggle();
        }
    }

    @OnEvent(
        value = PlayerJoinEvent.class,
        priority = EventPriority.HIGH
    )
    public void onJoin(@Inject final Player player)
    {
        final UUID uuid = player.getUniqueId();

        if(!this.sidebarService.hasSidebar(uuid))
        {
            this.sidebarService.init(uuid);
        }
    }

    @OnEvent(
        value = PlayerQuitEvent.class,
        priority = EventPriority.HIGH
    )
    public void onQuit(@Inject final Player player)
    {
        final UUID uuid = player.getUniqueId();

        if(this.sidebarService.hasSidebar(uuid))
        {
            this.sidebarService.getSidebar(uuid)
                .unload();
        }
    }
}
