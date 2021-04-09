package com.muijf.amongusinminecraft.core.sidebar;

import com.minecraftmultiplayer.pluggit.common.container.node.type.component.Component;

public final class Sidebar extends Component<Sidebar>
{
    public void toggle()
    {
        System.out.println("toggled sidebar");
    }

    @Override
    public void unload()
    {

    }
}
