package me.xplore.testing.levents.listeners;

import com.google.gson.JsonObject;
import me.xplore.testing.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import sounds.SoundLibrary;

import java.io.File;
import java.io.IOException;

public class EventCreator implements CommandExecutor, Listener {

    private Main main;

    public EventCreator() {
        this.main = main;
    }
    static String currentEvent = null;
    static boolean shouldWriteEvent = false;
    SoundLibrary slb = new SoundLibrary();

    @EventHandler
    public void onBlockPlaced(BlockPlaceEvent event) {
        if (shouldWriteEvent) {
            if (!event.getPlayer().isOp()) {
                return;
            } if(currentEvent.isEmpty()) { event.getPlayer().sendMessage("Event not selected. Please run /eventcreator edit eventname"); }
            Location location = event.getBlock().getLocation();
            event.getPlayer().sendMessage(event.getBlock().getType().toString() + " : " + ChatColor.AQUA + "X : " + location.getX() + ChatColor.RED + " Y : " + location.getY() + ChatColor.YELLOW + " Z : " + location.getZ());

        }
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!sender.isOp()) { return false; }
        Player p = (Player) sender;
        if(args == null) { shouldWriteEvent = !shouldWriteEvent; sender.sendMessage(ChatColor.GREEN + "Event Creator Toggled!"); p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 4 ,4 ); return false;}
        if(args[0].toLowerCase().equals("status"))
        {
            if(shouldWriteEvent) { sender.sendMessage(ChatColor.GREEN + "Event Creator is Enabled"); }
            else { sender.sendMessage(ChatColor.RED + "Event Creator is Disabled"); }
        }
        if(args[0].toLowerCase().equals("edit"))
        {
            File eventFile = new File("link" + args[1].toLowerCase() + ".json");
            if(args[0].isEmpty()) { shouldWriteEvent = !shouldWriteEvent; }
            if(!args[1].isEmpty()) { if(!eventFile.exists()) {
                sender.sendMessage(ChatColor.RED + "Event not Found, Creating file"); slb.PlaySoundLocation(p, Sound.ENTITY_DRAGON_FIREBALL_EXPLODE);
                try {
                    eventFile.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else { sender.sendMessage(ChatColor.GREEN + "Event Found! You are free to begin editing");
                slb.PlaySoundLocation(p, Sound.ENTITY_PLAYER_LEVELUP);
                currentEvent = args[0].toLowerCase(); }
            }
        }


        return false;
    }
}
