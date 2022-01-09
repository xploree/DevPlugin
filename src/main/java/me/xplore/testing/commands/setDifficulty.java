package me.xplore.testing.commands;

import me.xplore.testing.Main;
import org.bukkit.Difficulty;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class setDifficulty implements CommandExecutor {
    private final Main main;

    public setDifficulty(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String newDif = args[0];
        Player p = (Player) sender;
        World world = p.getWorld();
        switch (newDif)
        {
            case "peaceful": world.setDifficulty(Difficulty.PEACEFUL);
            case "easy": world.setDifficulty(Difficulty.EASY);
            case "normal": world.setDifficulty(Difficulty.NORMAL);
            case "hard": world.setDifficulty(Difficulty.HARD);
        }
        return false;
    }
}
