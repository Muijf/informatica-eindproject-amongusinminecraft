package com.muijf.amongusinminecraft.core.menu;

import com.minecraftmultiplayer.pluggit.common.container.node.Node;
import com.minecraftmultiplayer.pluggit.common.container.node.NodeService;
import com.minecraftmultiplayer.pluggit.common.container.node.event.NodeInjectEvent;
import com.minecraftmultiplayer.pluggit.common.container.node.type.component.Component;
import org.bukkit.entity.Player;

@Node.Config(
    version = "1.0"
)
public class Menu extends Component<Menu>
{
    private final Player player;

    @Inject private MenuService menuService;
    @Inject private NodeService nodeService;

    public Menu(final Player player)
    {
        this.player = player;
    }

    @On(NodeInjectEvent.class)
    public final void onInjected()
    {

    }
}
