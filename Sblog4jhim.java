package com.sblog4jhim.sblog4jhim;

import com.sblog4jhim.sblog4jhim.events.chexiao;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;


import java.awt.*;

public final class Sblog4jhim extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info(ChatColor.AQUA+"him系列插件正在加载");
        getLogger().info(ChatColor.BLUE+"**************************");
        getLogger().info("__   ___             _ _        ");
        getLogger().info("\\ \\ / (_)_ __       | (_)_ __   __ _");
        getLogger().info(" \\ V /| | '_ \\   _  | | | '_ \\ / _` |");
        getLogger().info("  | | | | | | | | |_| | | | | | (_| |");
        getLogger().info("  |_| |_|_| |_|  \\___/|_|_| |_|\\__, |");
        getLogger().info("                               |___/");
        getLogger().info(ChatColor.BLUE+"**************************");

        getServer().getPluginManager().registerEvents(new chexiao(), this);
    }



    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info(ChatColor.AQUA+"him系列插件正在卸载");
        getLogger().info(ChatColor.BLUE+"**************************");
        getLogger().info("__   ___             _ _        ");
        getLogger().info("\\ \\ / (_)_ __       | (_)_ __   __ _");
        getLogger().info(" \\ V /| | '_ \\   _  | | | '_ \\ / _` |");
        getLogger().info("  | | | | | | | | |_| | | | | | (_| |");
        getLogger().info("  |_| |_|_| |_|  \\___/|_|_| |_|\\__, |");
        getLogger().info("                               |___/");
        getLogger().info(ChatColor.BLUE+"**************************");
    }
}

