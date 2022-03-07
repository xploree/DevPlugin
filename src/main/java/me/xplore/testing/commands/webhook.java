package me.xplore.testing.commands;

import me.xplore.testing.Main;
import me.xplore.testing.utils.DiscordWebhook;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.awt.*;
import java.io.IOException;

public class webhook implements CommandExecutor {
    private final Main main;
    String webhookURL = "no webhook for you :) ";

    public webhook(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        World w = p.getWorld();

        StringBuilder message = new StringBuilder();
        for (String arg : args) {
            message.append(" ").append(arg);
        }
        DiscordWebhook webhook = new DiscordWebhook(webhookURL);
        webhook.setContent(String.valueOf(message));
        try {
            webhook.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        sender.sendMessage(ChatColor.GREEN + "Message Delivered!");
        w.playSound(p.getLocation(), Sound.ITEM_CROSSBOW_HIT, 10, 1);


        return false;
    }
}
