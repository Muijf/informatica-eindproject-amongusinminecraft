package com.muijf.amongusinminecraft.core.user;

import com.minecraftmultiplayer.pluggit.common.container.node.type.component.Component;
import org.bukkit.entity.Player;

import java.util.UUID;

public final class User extends Component<User>
{
    private Player player;

    public final UUID getUUID()
    {
        return UUID.randomUUID();
    }

    public Player getPlayer()
    {
        return this.player;
    }
}
