package com.muijf.amongusinminecraft.core.user;

import com.minecraftmultiplayer.commands.bukkit.hook.OnCommand;
import com.minecraftmultiplayer.events.bukkit.hook.OnEvent;
import com.minecraftmultiplayer.packets.bukkit.hook.OnPacket;
import com.minecraftmultiplayer.packets.common.Packet;
import com.minecraftmultiplayer.pluggit.common.container.node.type.controller.Controller;
import com.minecraftmultiplayer.pluggit.common.log.LogService;
import org.bukkit.entity.Player;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerJoinEvent;

public final class UserController extends Controller
{
    @Inject
    private LogService logService;

    @OnEvent(
        value = PlayerJoinEvent.class,
        priority = EventPriority.HIGH
    )
    public static void onJoin(@Inject final Player player)
    {
        UserController.sayHi(player);
    }

    @OnCommand("/hi")
    private static void sayHi(@Inject final Player player)
    {
        player.sendMessage(String.format("Hello %s", player.getName()));
    }

    @OnPacket(Packet.Type.PLAY_SERVER_SPAWN_ENTITY_PAINTING)
    public void onPacket()
    {

    }
}
