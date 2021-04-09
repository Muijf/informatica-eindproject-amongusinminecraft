package com.minecraftmultiplayer.pluggit.common.util.system;

public final class System
{
    private static final OS os;

    static
    {
        final String osName = java.lang.System.getProperty("os.name").toLowerCase();

        if(osName.contains("win"))
        {
            os = OS.WINDOWS;
        }
        else if(osName.contains("mac"))
        {
            os = OS.MACOS;
        }
        else if(osName.contains("nix") || osName.contains("nux") || osName.contains("aix"))
        {
            os = OS.UNIX;
        }
        else if(osName.contains("sunos"))
        {
            os = OS.SOLARIS;
        }
        else
        {
            os = OS.UNKNOWN;
        }
    }

    private System() {}

    public static OS getOS()
    {
        return os;
    }

    public enum OS
    {
        WINDOWS, MACOS, UNIX, SOLARIS, UNKNOWN
    }
}
