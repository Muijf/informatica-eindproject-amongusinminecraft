package com.minecraftmultiplayer.packets.common;

import com.minecraftmultiplayer.packets.bukkit.adapter.ProtocolLibAdapter;
import com.minecraftmultiplayer.pluggit.common.container.node.Node;
import com.minecraftmultiplayer.pluggit.common.container.node.type.component.Component;
import com.minecraftmultiplayer.pluggit.common.container.node.type.module.Module;
import com.minecraftmultiplayer.pluggit.common.container.node.type.provider.Provider;

@Node.Config(
    version = "1.0",
    defaultProps = {
        @Node.Prop(
            id = "ADAPTER",
            classValue = ProtocolLibAdapter.class
        )
    }
)
@Module.Config(
    providers = {
        @Provider.Ref(PacketsService.class)
    },
    components = {
        @Component.Ref(Packet.class)
    }
)
public final class PacketsModule extends Module<PacketsModule>
{}
