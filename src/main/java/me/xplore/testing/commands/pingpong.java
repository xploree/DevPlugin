package me.xplore.testing.commands;

import me.xplore.testing.Main;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.UUID;

public class pingpong implements CommandExecutor {
    private final Main main;

    public pingpong(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args[0] == null)
        {
            Bukkit.getServer().broadcastMessage("Invalid Input");
        } else {
            Bukkit.getServer().broadcastMessage(args[0]);
            return true;
        }

        return false;
    }
}
