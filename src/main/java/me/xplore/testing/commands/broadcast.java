package me.xplore.testing.commands;

import me.xplore.testing.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class broadcast implements CommandExecutor {
    private final Main main;

    public broadcast(Main main) {
        this.main = main;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender.isOp()) {
            StringBuilder message = new StringBuilder();
            for (String arg : args) {
                message.append(" ").append(arg);
            }
            Bukkit.getServer().broadcastMessage(ChatColor.BLUE + "Broadcast :" + message + ChatColor.YELLOW + " From : " + sender.getName());

        }
        else {
            return true;
        }

        return false;
    }
}
