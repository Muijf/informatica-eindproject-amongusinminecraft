package com.muijf.amongusinminecraft.core.sidebar;

import com.minecraftmultiplayer.pluggit.common.container.node.type.provider.Provider;

import java.util.UUID;

@Provider.Config(
    providedIn = SidebarModule.class
)
public final class SidebarService extends Provider<SidebarService>
{
    public final boolean hasSidebar(final UUID uuid)
    {
        return false;
    }

    public final Sidebar init(final UUID uuid)
    {
        return null;
    }

    public final Sidebar getSidebar(final UUID uuid)
    {
        return null;
    }
}
