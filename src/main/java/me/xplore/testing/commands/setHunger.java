package me.xplore.testing.commands;

import me.xplore.testing.Main;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class setHunger implements CommandExecutor {
    private final Main main;

    public setHunger(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        int newHunger = Integer.parseInt(args[0]);
        Player p = (Player) sender;
        p.setFoodLevel(newHunger);
        return false;


    }
}
