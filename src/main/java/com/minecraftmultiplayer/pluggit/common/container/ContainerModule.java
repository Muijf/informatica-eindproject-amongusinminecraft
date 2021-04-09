package com.minecraftmultiplayer.pluggit.common.container;

import com.minecraftmultiplayer.pluggit.common.container.node.type.component.Component;
import com.minecraftmultiplayer.pluggit.common.container.node.type.module.Module;
import com.minecraftmultiplayer.pluggit.common.container.node.type.provider.Provider;

@Module.Config(
    providers = {
        @Provider.Ref(ContainerService.class)
    },
    components = {
        @Component.Ref(Container.class)
    }
)
public final class ContainerModule extends Module
{

}
