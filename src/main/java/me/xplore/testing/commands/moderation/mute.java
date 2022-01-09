package me.xplore.testing.commands.moderation;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Collection;

public class mute implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = Bukkit.getPlayerExact(args[0]);
        int timeToMute = Integer.parseInt(args[1]);
        if(player == null)
        {
            sender.sendMessage(ChatColor.RED + "Error : That Player is not online");
            return false;
        }

        return false;

    }
}
