package com.minecraftmultiplayer.pluggit.bukkit;

import com.minecraftmultiplayer.pluggit.common.Pluggit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public abstract class BukkitBootstrap extends Pluggit.Bootstrap<JavaPlugin>
{
    public BukkitBootstrap(final JavaPlugin main)
    {
        super(main);
    }

    @Override
    public final File getRootDirectory()
    {
        return new File("plugins");
    }

    @Override
    public Platform getCompatiblePlatform()
    {
        return Platform.BUKKIT;
    }
}
