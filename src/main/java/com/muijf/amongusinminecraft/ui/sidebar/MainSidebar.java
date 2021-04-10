package com.muijf.amongusinminecraft.ui.sidebar;

import com.muijf.amongusinminecraft.core.sidebar.Sidebar;

public final class MainSidebar extends Sidebar
{
    @Override
    public Line[] getLines()
    {
        return new Line[]{
            new Line(0, "&b&lAmong Us In Minecraft"), // title
            new Line(1, " "),
            new Line(2, "&dYou are the imposter!"),
            new Line(3, "&7&oKill as many as you can"),
            new Line(4, "And don't get caught!")
        };
    }
}
