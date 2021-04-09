package com.minecraftmultiplayer.pluggit.common.log;

import com.minecraftmultiplayer.pluggit.common.container.node.type.component.Component;

import java.util.Date;

/**
 * Represents one log
 *
 * @author Muijf
 * @since 1.0
 */
public final class Log extends Component<Log>
{
    private Date date;

    /**
     * Returns the date of when the log was sent
     *
     * @return the date of when the log was sent
     */
    public Date getDate()
    {
        return this.date;
    }

    /**
     * Log level enum
     */
    public enum Level
    {
        INFO, ERROR, WARN, DEBUG
    }
}
