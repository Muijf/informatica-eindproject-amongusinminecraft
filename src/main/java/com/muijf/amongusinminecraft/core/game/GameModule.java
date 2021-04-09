package com.muijf.amongusinminecraft.core.game;

import com.minecraftmultiplayer.pluggit.common.container.node.type.component.Component;
import com.minecraftmultiplayer.pluggit.common.container.node.type.controller.Controller;
import com.minecraftmultiplayer.pluggit.common.container.node.type.module.Module;
import com.minecraftmultiplayer.pluggit.common.container.node.type.provider.Provider;

@Module.Config(
    controllers = {
        @Controller.Ref(GameController.class)
    },
    providers = {
        @Provider.Ref(GameService.class)
    },
    components = {
        @Component.Ref(Game.class)
    }
)
public final class GameModule extends Module<GameModule>
{
}
