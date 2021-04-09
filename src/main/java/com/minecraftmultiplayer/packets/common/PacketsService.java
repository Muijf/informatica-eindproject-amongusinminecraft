package com.minecraftmultiplayer.packets.common;

import com.minecraftmultiplayer.pluggit.common.container.node.Node;
import com.minecraftmultiplayer.pluggit.common.container.node.type.provider.Provider;

@Node.Config(
    version = "1.0"
)
@Provider.Config(
    providedIn = PacketsModule.class
)
public final class PacketsService extends Provider<PacketsService>
{}
