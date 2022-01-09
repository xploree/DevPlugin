package me.xplore.testing.commands;

import me.xplore.testing.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class playerLocation implements CommandExecutor {

    private final Main main;

    public playerLocation(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender.isOp() & sender instanceof Player)
        {
            Player p = (Player) Bukkit.getPlayer(args[0]); assert p != null;
            sender.sendMessage(ChatColor.BLUE + p.getName() + "'s Location : " + ChatColor.GREEN + " x : " + p.getLocation().getX() + " y : " + p.getLocation().getY() + " z : " + p.getLocation().getZ());
        }

        return false;
    }
}
