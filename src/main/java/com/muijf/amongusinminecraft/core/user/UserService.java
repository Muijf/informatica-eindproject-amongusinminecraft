package com.muijf.amongusinminecraft.core.user;

import com.google.common.collect.ImmutableList;
import com.minecraftmultiplayer.pluggit.common.container.node.type.provider.Provider;
import com.muijf.amongusinminecraft.core.user.exception.UserAlreadyRegistered;
import com.muijf.amongusinminecraft.core.user.exception.UserNotFoundException;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.UUID;

@Provider.Config(
    providedIn = UserModule.class
)
public final class UserService extends Provider<UserService>
{
    private final Map<UUID, User> userMap = new IdentityHashMap<>();

    /**
     * Register a new user
     *
     * @param uuid unique id for the user
     * @return an instance of the created user object
     * @throws UserAlreadyRegistered if the user has already been registered
     */
    public final User registerUser(final UUID uuid) throws UserAlreadyRegistered
    {
        if(this.isUserRegistered(uuid))
        {
            throw new UserAlreadyRegistered(this.getUser(uuid), String.format("User with uuid '%s' has already been registered", uuid.toString()));
        }
        return this.userMap.put(uuid, new User());
    }

    /**
     * Checks if the user is registered.
     *
     * @param uuid unique id for the user
     * @return true if registered
     */
    public final boolean isUserRegistered(final UUID uuid)
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
    public final User getUser(final UUID uuid) throws UserNotFoundException
    {
        if(!this.userMap.containsKey(uuid))
        {
            throw new UserNotFoundException(String.format("Could not find the user with uuid '%s'", uuid.toString()));
        }
        return this.userMap.get(uuid);
    }

    /**
     * Unregister the user with the given unique id
     *
     * @param uuid unique id for the user
     * @throws UserNotFoundException if the user wasn't found
     */
    public final void unregisterUser(final UUID uuid) throws UserNotFoundException
    {
        if(!this.isUserRegistered(uuid))
        {
            throw new UserNotFoundException(String.format("Could not unregister user uuid '%s'. The user wasn't found", uuid.toString()));
        }
        this.userMap.remove(uuid);
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
