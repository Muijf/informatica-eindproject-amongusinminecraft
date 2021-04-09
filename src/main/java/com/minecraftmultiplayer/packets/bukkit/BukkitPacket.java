package com.minecraftmultiplayer.packets.bukkit;

import com.minecraftmultiplayer.packets.common.Packet;
import com.minecraftmultiplayer.pluggit.common.container.node.Node;

@Node.Config(
    version = "1.0"
)
public final class BukkitPacket extends Packet<BukkitPacket>
{
    @Override
    public Platform getCompatiblePlatform()
    {
        return Platform.BUKKIT;
    }
}
