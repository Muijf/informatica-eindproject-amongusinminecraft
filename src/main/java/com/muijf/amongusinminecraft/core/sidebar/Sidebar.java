package com.muijf.amongusinminecraft.core.sidebar;

import com.minecraftmultiplayer.pluggit.common.container.node.type.component.Component;

public abstract class Sidebar extends Component<Sidebar>
{
    public void toggle()
    {
        System.out.println("toggled sidebar");
    }

    @Override
    public void unload()
    {

    }

    public abstract Line[] getLines();

    public final static class Line
    {
        private final int index;
        private final String text;

        public Line(final int index, final String text)
        {
            this.index = index;
            this.text = text;
        }

        public int getIndex()
        {
            return this.index;
        }

        public String getText()
        {
            return this.text;
        }
    }
}
