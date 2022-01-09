package me.xplore.testing.commands;

import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class explode implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        World world = p.getWorld();
        world.createExplosion(p.getLocation(), 5);
        world.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 10, 1);
        return false;
    }
}
