package com.minecraftmultiplayer.events.common;

import com.minecraftmultiplayer.pluggit.common.container.node.Node;
import com.minecraftmultiplayer.pluggit.common.container.node.type.component.Component;
import com.minecraftmultiplayer.pluggit.common.container.node.type.module.Module;
import com.minecraftmultiplayer.pluggit.common.container.node.type.provider.Provider;

@Node.Config(
    version = "1.0"
)
@Module.Config(
    providers = {
        @Provider.Ref(EventsService.class)
    },
    components = {
        @Component.Ref(Event.class)
    }
)
public final class EventsModule extends Module<EventsModule>
{}
