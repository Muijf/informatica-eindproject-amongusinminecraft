package com.minecraftmultiplayer.pluggit.common.exception;

public abstract class Exception extends java.lang.Exception
{
    private static final long serialVersionUID = 2836877986127342731L;

    public Exception(final String message)
    {
        super(message);
    }

    public Exception(final String message, final Throwable cause)
    {
        super(message, cause);
    }
}
