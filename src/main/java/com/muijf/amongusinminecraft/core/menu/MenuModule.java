package com.muijf.amongusinminecraft.core.menu;

import com.minecraftmultiplayer.pluggit.common.container.node.type.component.Component;
import com.minecraftmultiplayer.pluggit.common.container.node.type.controller.Controller;
import com.minecraftmultiplayer.pluggit.common.container.node.type.module.Module;
import com.minecraftmultiplayer.pluggit.common.container.node.type.provider.Provider;

@Module.Config(
    controllers = {
        @Controller.Ref(MenuController.class)
    },
    providers = {
        @Provider.Ref(MenuService.class)
    },
    components = {
        @Component.Ref(Menu.class)
    }
)
public final class MenuModule extends Module<MenuModule>
{
    public MenuModule()
    {

    }
}
