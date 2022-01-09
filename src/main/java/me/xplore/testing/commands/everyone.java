package me.xplore.testing.commands;

import me.xplore.testing.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import sounds.SoundLibrary;

public class everyone implements CommandExecutor {
    private final Main main;

    public everyone(Main main) {
        this.main = main;
    }
    SoundLibrary slb = new SoundLibrary();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender.isOp()) {
            StringBuilder message = new StringBuilder();
            if(args != null)
            {
                for (String arg : args) {
                    message.append(arg);
                }
                for(Player p : Bukkit.getOnlinePlayers())
                {
                    p.sendMessage(message.toString());
                }
                return false;
            }
                slb.PingAll();
                return false;
        }
        return false;
    }
}
