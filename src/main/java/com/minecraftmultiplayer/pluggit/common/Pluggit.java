package com.minecraftmultiplayer.pluggit.common;

import com.minecraftmultiplayer.pluggit.bukkit.log.BukkitLogService;
import com.minecraftmultiplayer.pluggit.common.compatible.Compatible;
import com.minecraftmultiplayer.pluggit.common.container.Container;
import com.minecraftmultiplayer.pluggit.common.util.system.System;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.file.Files;
import java.nio.file.Path;

public final class Pluggit
{
    private Pluggit() {}

    public static void bootstrap(final Bootstrap<?> bootstrap)
    {
        bootstrap.init(new Pluggit());
    }

    public static void shutdown()
    {

    }

    public static abstract class Bootstrap<T> implements Compatible
    {
        private static final String MAIN_DIRECTORY_NAME = ".pluggit";

        private final T main;

        public Bootstrap(final T main)
        {
            this.main = main;
        }

        public T getMain()
        {
            return this.main;
        }

        private void init(final Pluggit pluggit)
        {
            final BukkitLogService logService = new BukkitLogService();
            final Path mainDirectory = Path.of(this.getRootDirectory().getAbsolutePath(), MAIN_DIRECTORY_NAME);
            final String mainDirectoryStr = mainDirectory.toString();

            try
            {
                if(Files.notExists(mainDirectory))
                {
                    Files.createDirectory(mainDirectory);
                    logService.info("Created file %s", mainDirectoryStr);
                }
                else
                {
                    logService.info("Did not create file %s. The file already exists", mainDirectoryStr);
                }

                if(System.getOS().equals(System.OS.WINDOWS))
                {
                    Files.setAttribute(mainDirectory, "dos:hidden", true);
                    logService.info("Windows system detected, file %s has been made hidden", mainDirectoryStr);
                }
                else
                {
                    logService.info("Windows system not detected, file %s could not be made hidden", mainDirectoryStr);
                }

                for(final String directoryName : new String[]{"cache", "static", "whatever", "whatever2"})
                {
                    final Path directory = Path.of(mainDirectory.toString(), directoryName);
                    final String directoryStr = directory.toString();

                    if(Files.notExists(directory))
                    {
                        Files.createDirectory(directory);
                        logService.info("Created file %s", directoryStr);
                    }
                    else
                    {
                        logService.info("Did not create file %s. The file already exists", directoryStr);
                    }
                }
            }
            catch(final IOException e)
            {
                logService.severe("Something went wrong while working with files: %s", e.getMessage());
            }
        }

        public abstract File getRootDirectory();

        @Target(ElementType.TYPE)
        @Retention(RetentionPolicy.RUNTIME)
        public @interface Config
        {
            Class<? extends Container> container();

            boolean debug() default false;
        }
    }
}
