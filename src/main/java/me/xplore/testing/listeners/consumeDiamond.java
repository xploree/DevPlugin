package me.xplore.testing.listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;

public class consumeDiamond implements Listener {
    @EventHandler
    public void onLeaveServer(PlayerItemConsumeEvent event)
    {
        event.getPlayer().sendMessage("Enjoy your diamond");
        event.getPlayer().getInventory().addItem(new ItemStack(Material.DIAMOND));

    }
}
