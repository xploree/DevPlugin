package me.xplore.testing.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPortalEvent;

public class portalJump implements Listener {
    @EventHandler
    public void onEnterPortal(PlayerPortalEvent event)
    {
        event.getPlayer().sendMessage(ChatColor.RED + "Traveller : I heard portal hopping can be dangerous, good luck " + event.getPlayer().getName());
        int random = (int)(Math.random() * 10 + 1);
        if(random == 1 || random == 2 || random == 3 || random == 4)
        {
            Player p = (Player) event.getPlayer();
            p.setHealth(p.getHealth()/2);
        }
    }
}
