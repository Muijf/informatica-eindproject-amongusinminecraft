package com.muijf.amongusinminecraft.core.user;

import com.minecraftmultiplayer.pluggit.common.container.node.type.component.Component;
import com.minecraftmultiplayer.pluggit.common.container.node.type.controller.Controller;
import com.minecraftmultiplayer.pluggit.common.container.node.type.module.Module;
import com.minecraftmultiplayer.pluggit.common.container.node.type.provider.Provider;

@Module.Config(
    controllers = {
        @Controller.Ref(UserController.class)
    },
    providers = {
        @Provider.Ref(UserService.class)
    },
    components = {
        @Component.Ref(User.class)
    }
)
public final class UserModule extends Module<UserModule>
{

}
