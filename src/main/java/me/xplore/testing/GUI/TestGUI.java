package me.xplore.testing.GUI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class TestGUI implements Listener {
    private Inventory gui;

    public void openNewGui(Player p)
    {
        gui = Bukkit.createInventory(null, InventoryType.HOPPER);

        ItemStack item = new ItemStack(Material.GREEN_CONCRETE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GREEN + "Button");
        item.setItemMeta(meta);

        gui.setItem(0, item);

        p.openInventory(gui);
    }

    @EventHandler
    public void guiClickEvent(InventoryClickEvent event)
    {
        if(!event.getInventory().equals(gui))
        {
            return;
        }
        event.setCancelled(true);
    }
}
