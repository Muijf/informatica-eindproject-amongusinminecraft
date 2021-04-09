package com.muijf.amongusinminecraft.core.menu;

import com.minecraftmultiplayer.events.bukkit.hook.OnEvent;
import com.minecraftmultiplayer.pluggit.common.container.node.type.controller.Controller;
import org.bukkit.event.player.PlayerJoinEvent;

public final class MenuController extends Controller<MenuController>
{
    @OnEvent(PlayerJoinEvent.class)
    public void onEvent()
    {

    }
}
