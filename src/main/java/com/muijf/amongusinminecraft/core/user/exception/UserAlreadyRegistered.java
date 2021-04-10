package com.muijf.amongusinminecraft.core.user.exception;

import com.muijf.amongusinminecraft.core.user.User;

public class UserAlreadyRegistered extends UserException
{
    private static final long serialVersionUID = -6516866881127761699L;

    public UserAlreadyRegistered(final User user, final String message)
    {
        super(user, message);
    }
}
