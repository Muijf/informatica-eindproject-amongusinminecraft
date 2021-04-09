package com.minecraftmultiplayer.commands.common;

import com.minecraftmultiplayer.pluggit.common.container.node.Node;
import com.minecraftmultiplayer.pluggit.common.container.node.type.component.Component;
import com.minecraftmultiplayer.pluggit.common.container.node.type.module.Module;
import com.minecraftmultiplayer.pluggit.common.container.node.type.provider.Provider;

@Node.Config(
    version = "1.0"
)
@Module.Config(
    providers = {
        @Provider.Ref(CommandsService.class)
    },
    components = {
        @Component.Ref(Command.class)
    }
)
public final class CommandsModule extends Module<CommandsModule>
{}
