package com.muijf.amongusinminecraft.core.user;

import com.minecraftmultiplayer.commands.bukkit.hook.OnCommand;
import com.minecraftmultiplayer.events.bukkit.hook.OnEvent;
import com.minecraftmultiplayer.packets.bukkit.hook.OnPacket;
import com.minecraftmultiplayer.packets.common.Packet;
import com.minecraftmultiplayer.pluggit.bukkit.log.BukkitLogService;
import com.minecraftmultiplayer.pluggit.common.container.node.type.controller.Controller;
import org.bukkit.entity.Player;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerJoinEvent;

public final class UserController extends Controller<UserController>
{
    @Inject private BukkitLogService logService;

    @OnEvent(
        value = PlayerJoinEvent.class,
        priority = EventPriority.HIGH
    )
    public final void onJoin(@Inject final Player player)
    {

    }

    @OnCommand("/hi")
    public final void sayHi(@Inject final Player player)
    {
        player.sendMessage(String.format("Hello %s", player.getName()));
    }

    @OnPacket(Packet.Type.PLAY_SERVER_SPAWN_ENTITY_PAINTING)
    public final void onPacket()
    {

    }
}
