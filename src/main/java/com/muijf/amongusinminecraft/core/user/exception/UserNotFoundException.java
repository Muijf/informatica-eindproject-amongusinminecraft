package com.muijf.amongusinminecraft.core.user.exception;

import com.minecraftmultiplayer.pluggit.common.exception.RuntimeException;

public final class UserNotFoundException extends RuntimeException
{
    private static final long serialVersionUID = -259422933193041219L;

    public UserNotFoundException(final String message)
    {
        super(message);
    }
}
