package me.xplore.testing.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class welcome implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {
        Bukkit.getServer().broadcastMessage(ChatColor.RED + "Welcome to the server, " + ChatColor.GREEN + event.getPlayer().getName());
    }
}
