package com.muijf.amongusinminecraft.core;

import com.minecraftmultiplayer.pluggit.bukkit.BukkitBootstrap;
import com.minecraftmultiplayer.pluggit.common.Pluggit;
import com.minecraftmultiplayer.pluggit.common.container.node.type.module.Module;
import com.muijf.amongusinminecraft.core.game.GameModule;
import com.muijf.amongusinminecraft.core.menu.MenuModule;
import com.muijf.amongusinminecraft.core.sidebar.SidebarModule;
import com.muijf.amongusinminecraft.core.user.UserModule;
import org.bukkit.plugin.java.JavaPlugin;

public final class Core extends JavaPlugin
{
    @Override
    public void onDisable()
    {
        Pluggit.shutdown();
    }

    @Override
    public void onEnable()
    {
        Pluggit.bootstrap(new Bootstrap(this));
    }

    @Pluggit.Bootstrap.Config(
        container = Core.Container.class,
        debug = true
    )
    private static class Bootstrap extends BukkitBootstrap
    {
        Bootstrap(final JavaPlugin main)
        {
            super(main);
        }
    }

    @Container.Config(
        rootModule = Container.RootModule.class
    )
    public static final class Container extends com.minecraftmultiplayer.pluggit.common.container.Container
    {
        @Module.Config(
            modules = {
                @Module.Ref(UserModule.class),
                @Module.Ref(MenuModule.class),
                @Module.Ref(SidebarModule.class),
                @Module.Ref(GameModule.class),
            }
        )
        static final class RootModule extends Module<RootModule> {}
    }
}
