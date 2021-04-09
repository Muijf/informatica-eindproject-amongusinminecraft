package com.minecraftmultiplayer.inventory.common;

import com.minecraftmultiplayer.pluggit.common.container.node.Node;
import com.minecraftmultiplayer.pluggit.common.container.node.type.component.Component;

@Node.Config(
    version = "1.0"
)
public abstract class Inventory<T extends Inventory<T>> extends Component<T>
{

}
