package com.minecraftmultiplayer.commands.bukkit.hook;

import com.minecraftmultiplayer.pluggit.common.container.node.Node;

public @interface OnCommand
{
    String value();

    final class Handler extends Node.Hook.Handler<OnCommand>
    {
        private Handler() {}

        @Override
        public Class<OnCommand> getAnnotationType()
        {
            return OnCommand.class;
        }
    }
}
