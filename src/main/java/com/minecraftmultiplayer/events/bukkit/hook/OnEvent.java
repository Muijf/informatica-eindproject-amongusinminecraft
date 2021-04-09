package com.minecraftmultiplayer.events.bukkit.hook;

import com.minecraftmultiplayer.pluggit.common.container.node.Node;
import org.bukkit.event.Event;
import org.bukkit.event.EventPriority;

public @interface OnEvent
{
    Class<? extends Event> value();

    EventPriority priority() default EventPriority.NORMAL;

    final class Handler extends Node.Hook.Handler<OnEvent>
    {
        private Handler() {}

        @Override
        public Class<OnEvent> getAnnotationType()
        {
            return OnEvent.class;
        }
    }
}
