package com.sblog4jhim.sblog4jhim.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class chexiao implements Listener {
    @EventHandler
    public void chexiao(AsyncPlayerChatEvent event) {
        if (event.getMessage().contains("jndi")) {
            event.setCancelled(true);
            Player player = event.getPlayer();
            player.sendMessage(ChatColor.RED + "哥们,什么年代了,咋还用log4j");
        }
    }

}
