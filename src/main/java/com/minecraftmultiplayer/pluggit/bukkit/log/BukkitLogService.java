package com.minecraftmultiplayer.pluggit.bukkit.log;

import com.minecraftmultiplayer.pluggit.common.log.Log;
import com.minecraftmultiplayer.pluggit.common.log.LogService;
import org.bukkit.Bukkit;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class BukkitLogService extends LogService<Level, BukkitLogService>
{
    private final Logger logger;

    public BukkitLogService()
    {
        this.logger = Bukkit.getLogger();
    }

    public final Log fine(final String message, final Object... args)
    {
        return this.log(Level.FINE, message, args);
    }

    @Override
    public final Log log(final Level level, final String message, final Object... args)
    {
        this.logger.log(level, String.format(message, args));
        return null;
    }

    public final Log finer(final String message, final Object... args)
    {
        return this.log(Level.FINER, message, args);
    }

    public final Log finest(final String message, final Object... args)
    {
        return this.log(Level.FINEST, message, args);
    }

    public final Log info(final String message, final Object... args)
    {
        return this.log(Level.INFO, message, args);
    }

    public final Log severe(final String message, final Object... args)
    {
        return this.log(Level.SEVERE, message, args);
    }

    public final Log warning(final String message, final Object... args)
    {
        return this.log(Level.WARNING, message, args);
    }

}
