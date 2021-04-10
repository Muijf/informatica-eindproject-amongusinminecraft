package com.muijf.amongusinminecraft.core.user;

import com.minecraftmultiplayer.commands.bukkit.hook.OnCommand;
import com.minecraftmultiplayer.events.bukkit.hook.OnEvent;
import com.minecraftmultiplayer.pluggit.bukkit.log.BukkitLogService;
import com.minecraftmultiplayer.pluggit.common.container.node.type.controller.Controller;
import org.bukkit.entity.Player;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.UUID;
import java.util.logging.Level;

public final class UserController extends Controller<UserController>
{
    @Inject private UserService userService;
    @Inject private BukkitLogService logService;

    @OnEvent(
        value = PlayerJoinEvent.class,
        priority = EventPriority.HIGHEST
    )
    public final void onJoin(@Inject final Player player)
    {
        final UUID uniqueId = player.getUniqueId();

        if(!this.userService.isUserRegistered(uniqueId))
        {
            this.userService.registerUser(uniqueId);
            this.logService.log(Level.INFO, "Registered a new user with uuid '%s' upon joining", uniqueId.toString());
        }
    }

    @OnEvent(
        value = PlayerQuitEvent.class,
        priority = EventPriority.HIGHEST
    )
    public final void onQuit(@Inject final Player player)
    {
        final UUID uniqueId = player.getUniqueId();

        if(this.userService.isUserRegistered(uniqueId))
        {
            this.userService.unregisterUser(uniqueId);
            this.logService.log(Level.INFO, "Unregistered a user with uuid '%s' upon leaving", uniqueId.toString());
        }
    }

    @OnCommand("/hi")
    public final void sayHi(@Inject final Player player)
    {
        player.sendMessage(String.format("Hello %s", player.getName()));
    }
}
