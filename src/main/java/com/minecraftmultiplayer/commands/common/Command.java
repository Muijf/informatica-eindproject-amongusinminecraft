package com.minecraftmultiplayer.commands.common;

import com.minecraftmultiplayer.pluggit.common.compatible.Compatible;
import com.minecraftmultiplayer.pluggit.common.container.node.Node;
import com.minecraftmultiplayer.pluggit.common.container.node.type.component.Component;

@Node.Config(
    version = "1.0"
)
public abstract class Command<T extends Command<T>> extends Component<T> implements Compatible
{}
