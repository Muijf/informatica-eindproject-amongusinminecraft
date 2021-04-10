package com.minecraftmultiplayer.pluggit.common.exception;

public abstract class RuntimeException extends java.lang.RuntimeException
{
    private static final long serialVersionUID = 694940199617186272L;

    public RuntimeException(final String message)
    {
        super(message);
    }

    public RuntimeException(final String message, final Throwable cause)
    {
        super(message, cause);
    }
}
