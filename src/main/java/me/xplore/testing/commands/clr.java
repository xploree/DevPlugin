package me.xplore.testing.commands;

import me.xplore.testing.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class clr implements CommandExecutor {
    private final Main main;

    public clr(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        p.getInventory().clear();
        sender.sendMessage(ChatColor.GREEN + "Inventory Cleared!");

        return false;
    }
}
