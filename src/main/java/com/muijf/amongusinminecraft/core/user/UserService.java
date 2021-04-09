package com.muijf.amongusinminecraft.core.user;

import com.minecraftmultiplayer.pluggit.common.container.node.type.provider.Provider;

import java.util.UUID;

public final class UserService extends Provider
{
    public User getUser(final UUID uuid)
    {
        return new User();
    }
}
