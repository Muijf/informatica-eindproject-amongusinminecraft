package com.minecraftmultiplayer.pluggit.common.compatible;

public interface Compatible
{
    Platform getCompatiblePlatform();

    enum Platform
    {
        BUKKIT, SPONGE, FORGE
    }
}
