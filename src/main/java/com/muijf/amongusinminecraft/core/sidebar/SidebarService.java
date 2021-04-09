package com.muijf.amongusinminecraft.core.sidebar;

import com.minecraftmultiplayer.pluggit.common.container.node.type.provider.Provider;

import java.util.UUID;

public final class SidebarService extends Provider<SidebarService>
{
    public final boolean hasSidebar(final UUID uuid)
    {
        return false;
    }

    public final Sidebar init(final UUID uuid)
    {
        return new Sidebar();
    }

    public final Sidebar getSidebar(final UUID uuid)
    {
        return new Sidebar();
    }
}
