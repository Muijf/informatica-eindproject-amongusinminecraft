package com.minecraftmultiplayer.commands.bukkit;

import com.minecraftmultiplayer.commands.common.Command;
import com.minecraftmultiplayer.pluggit.common.container.node.Node;

@Node.Config(
    version = "1.0"
)
public final class BukkitCommand extends Command<BukkitCommand>
{
    @Override
    public Platform getCompatiblePlatform()
    {
        return Platform.BUKKIT;
    }
}
