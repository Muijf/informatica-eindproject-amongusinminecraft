package com.muijf.amongusinminecraft.core.game;

import com.google.common.collect.ImmutableList;
import com.minecraftmultiplayer.pluggit.common.container.node.type.provider.Provider;

import java.util.ArrayList;
import java.util.List;

public final class GameService extends Provider<GameService>
{
    private final List<Game> games = new ArrayList<>();

    public ImmutableList<Game> getGames()
    {
        return ImmutableList.copyOf(this.games);
    }
}
