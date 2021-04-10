package com.muijf.amongusinminecraft.core.user;

import com.google.common.collect.ImmutableList;
import com.minecraftmultiplayer.pluggit.common.container.node.type.provider.Provider;
import com.muijf.amongusinminecraft.core.user.exception.UserNotFoundException;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.UUID;

public final class UserService extends Provider<UserService>
{
    private final Map<UUID, User> userMap = new IdentityHashMap<>();

    /**
     * Checks if the user is registered.
     *
     * @param uuid unique id for the user
     * @return true if registered
     */
    public boolean isUserRegistered(final UUID uuid)
    {
        return this.userMap.containsKey(uuid);
    }

    /**
     * Get a user
     *
     * @param uuid unique id for the user
     * @return an instance of the user object
     * @throws UserNotFoundException if the user couldn't be found
     */
    public User getUser(final UUID uuid) throws UserNotFoundException
    {
        if(!this.userMap.containsKey(uuid))
        {
            throw new UserNotFoundException(String.format("Could not find the user with uuid '%s'", uuid.toString()));
        }
        return new User();
    }

    /**
     * Get all the current registered users
     *
     * @return an immutable list of all the current registered users
     */
    public final ImmutableList<User> getUsers()
    {
        return ImmutableList.copyOf(this.userMap.values());
    }
}
