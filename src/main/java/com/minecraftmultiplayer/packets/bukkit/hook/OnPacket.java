package com.minecraftmultiplayer.packets.bukkit.hook;

import com.minecraftmultiplayer.packets.bukkit.adapter.ProtocolLibAdapter;
import com.minecraftmultiplayer.packets.common.Packet;
import com.minecraftmultiplayer.packets.common.adapter.Adapter;
import com.minecraftmultiplayer.pluggit.common.container.node.Node;

public @interface OnPacket
{
    Packet.Type value();

    Class<? extends Adapter> adapter() default ProtocolLibAdapter.class;

    final class Handler extends Node.Hook.Handler<OnPacket>
    {
        private Handler() {}

        @Override
        public Class<OnPacket> getAnnotationType()
        {
            return OnPacket.class;
        }
    }
}
