package com.muijf.amongusinminecraft.core.sidebar;

import com.minecraftmultiplayer.pluggit.common.container.node.type.component.Component;
import com.minecraftmultiplayer.pluggit.common.container.node.type.controller.Controller;
import com.minecraftmultiplayer.pluggit.common.container.node.type.module.Module;
import com.minecraftmultiplayer.pluggit.common.container.node.type.provider.Provider;

@Module.Config(
    controllers = {
        @Controller.Ref(SidebarController.class)
    },
    providers = {
        @Provider.Ref(SidebarService.class)
    },
    components = {
        @Component.Ref(Sidebar.class)
    }
)
public final class SidebarModule extends Module<SidebarModule>
{
    public SidebarModule()
    {

    }
}
