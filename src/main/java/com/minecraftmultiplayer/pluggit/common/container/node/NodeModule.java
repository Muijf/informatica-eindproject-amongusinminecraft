package com.minecraftmultiplayer.pluggit.common.container.node;

import com.minecraftmultiplayer.pluggit.common.container.node.type.module.Module;
import com.minecraftmultiplayer.pluggit.common.container.node.type.provider.Provider;

@Module.Config(
    providers = {
        @Provider.Ref(NodeService.class)
    }
)
public final class NodeModule extends Module
{

}
