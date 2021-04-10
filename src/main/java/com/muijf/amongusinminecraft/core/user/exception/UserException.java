package com.muijf.amongusinminecraft.core.user.exception;

import com.muijf.amongusinminecraft.core.user.User;

public class UserException extends RuntimeException
{
    private static final long serialVersionUID = 8375193481556791514L;

    private final User user;

    public UserException(final User user, final String message)
    {
        super(message);

        this.user = user;
    }

    public UserException(final User user, final String message, final Throwable cause)
    {
        super(message, cause);

        this.user = user;
    }

    public User getUser()
    {
        return this.user;
    }
}
