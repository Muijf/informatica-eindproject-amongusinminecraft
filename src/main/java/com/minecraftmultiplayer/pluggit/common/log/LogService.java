package com.minecraftmultiplayer.pluggit.common.log;

import com.minecraftmultiplayer.pluggit.common.container.node.type.provider.Provider;

/**
 * Handles logging to the console
 *
 * @author Muijf
 * @since 1.0
 */
public abstract class LogService<L, T extends LogService<L, T>> extends Provider<T>
{
    /**
     * Sends a log to the console
     *
     * @param level   level to log to
     * @param message to send
     * @return the sent log
     * @since 1.0
     */
    public abstract Log log(final L level, final String message, final Object... args);
}
