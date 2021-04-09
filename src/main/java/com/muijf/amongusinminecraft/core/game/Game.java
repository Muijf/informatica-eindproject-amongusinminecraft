package com.muijf.amongusinminecraft.core.game;

import com.google.common.collect.ImmutableList;
import com.minecraftmultiplayer.pluggit.common.container.node.type.component.Component;
import com.muijf.amongusinminecraft.core.user.User;

import java.util.ArrayList;
import java.util.List;

public final class Game extends Component<Game>
{
    private final List<Player> players = new ArrayList<>();
    private Map map;
    private Status status;

    public Status getStatus()
    {
        return this.status;
    }

    public ImmutableList<Player> getPlayers()
    {
        return ImmutableList.copyOf(this.players);
    }

    public Map getMap()
    {
        return this.map;
    }

    public enum Status
    {
        STARTED, WAITING
    }

    public static final class Map
    {
        private Status status;

        public Status getStatus()
        {
            return this.status;
        }

        public enum Status
        {
            READY, GENERATING
        }
    }

    public static final class Player
    {
        private User user;

        public User getUser()
        {
            return this.user;
        }
    }
}
