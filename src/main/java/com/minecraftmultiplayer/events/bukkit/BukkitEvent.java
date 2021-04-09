package com.minecraftmultiplayer.events.bukkit;

import com.minecraftmultiplayer.events.common.Event;
import com.minecraftmultiplayer.pluggit.common.container.node.Node;

@Node.Config(
    version = "1.0"
)
public final class BukkitEvent extends Event<BukkitEvent>
{
    @Override
    public Platform getCompatiblePlatform()
    {
        return Platform.BUKKIT;
    }
}
