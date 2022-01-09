package me.xplore.testing.commands;

import me.xplore.testing.Main;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class playmusic implements CommandExecutor {
    private final Main main;

    public playmusic(Main main) {
        this.main = main;
    }
    int amountOfSongs = 13;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        Player p = (Player) sender;
        World w = p.getWorld();
        if(sender.isOp())
        {
            if(args[0] != null)
            {String input = args[0];
                switch (input)
               {
                   case "cat": w.playSound(p.getLocation(), Sound.MUSIC_DISC_CAT, 10, 1); break;
                   case "blocks": w.playSound(p.getLocation(), Sound.MUSIC_DISC_BLOCKS, 10, 1); break;
                   case "13": w.playSound(p.getLocation(), Sound.MUSIC_DISC_13, 10, 1); break;
                   case "chirp": w.playSound(p.getLocation(), Sound.MUSIC_DISC_CHIRP, 10, 1); break;
                   case "far": w.playSound(p.getLocation(), Sound.MUSIC_DISC_FAR, 10, 1); break;
                   case "mall": w.playSound(p.getLocation(), Sound.MUSIC_DISC_MALL, 10, 1); break;
                   case "mellohi": w.playSound(p.getLocation(), Sound.MUSIC_DISC_MELLOHI, 10, 1); break;
                   case "stal": w.playSound(p.getLocation(), Sound.MUSIC_DISC_STAL, 10, 1); break;
                   case "strad": w.playSound(p.getLocation(), Sound.MUSIC_DISC_STRAD, 10, 1); break;
                   case "ward": w.playSound(p.getLocation(), Sound.MUSIC_DISC_WARD, 10, 1); break;
                   case "11": w.playSound(p.getLocation(), Sound.MUSIC_DISC_11, 10, 1); break;
                   case "wait": w.playSound(p.getLocation(), Sound.MUSIC_DISC_WAIT, 10, 1); break;
                   case "pigstep": w.playSound(p.getLocation(), Sound.MUSIC_DISC_PIGSTEP, 10, 1); break;
                   case "list": sender.sendMessage(ChatColor.GREEN + "Songs(" + amountOfSongs + ") : Cat, Blocks, 13, Chirp, Far, Mall, Mellohi, Stal, Strad, Ward, 11, Wait, Pigstep" );
               }
            }
        }
        return false;
    }
}
