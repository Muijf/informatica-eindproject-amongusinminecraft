package com.minecraftmultiplayer.pluggit.common.log;

import com.minecraftmultiplayer.pluggit.common.container.node.type.component.Component;
import com.minecraftmultiplayer.pluggit.common.container.node.type.module.Module;
import com.minecraftmultiplayer.pluggit.common.container.node.type.provider.Provider;

/**
 * Groups all log nodes together
 *
 * @author Muijf
 * @since 1.0
 */
@Module.Config(
    providers = {
        @Provider.Ref(LogService.class)
    },
    components = {
        @Component.Ref(Log.class)
    }
)
public final class LogModule extends Module<LogModule>
{
}
