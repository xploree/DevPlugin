package me.xplore.testing;

import me.xplore.testing.commands.*;
import me.xplore.testing.levents.listeners.EventCreator;
import me.xplore.testing.listeners.consumeDiamond;
import me.xplore.testing.listeners.portalJump;
import me.xplore.testing.listeners.welcome;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("[DEV PLUGIN] Plugin Booted");
        Objects.requireNonNull(getServer().getPluginCommand("ping")).setExecutor(new pingpong(this));
        Objects.requireNonNull(getServer().getPluginCommand("broadcast")).setExecutor(new broadcast(this));
        Objects.requireNonNull(getServer().getPluginCommand("webhook")).setExecutor(new webhook(this));
        Objects.requireNonNull(getServer().getPluginCommand("music")).setExecutor(new playmusic(this));
        Objects.requireNonNull(getServer().getPluginCommand("setDif")).setExecutor(new setDifficulty(this));
        Objects.requireNonNull(getServer().getPluginCommand("setHunger")).setExecutor(new setHunger(this));
        Objects.requireNonNull(getServer().getPluginCommand("clr")).setExecutor(new clr(this));
        Objects.requireNonNull(getServer().getPluginCommand("getLocation")).setExecutor(new playerLocation(this));
        Objects.requireNonNull(getServer().getPluginCommand("eventcreator")).setExecutor(new EventCreator());
        Objects.requireNonNull(getServer().getPluginCommand("everyone")).setExecutor(new everyone(this));

        getServer().getPluginManager().registerEvents(new welcome(), this);
        getServer().getPluginManager().registerEvents(new consumeDiamond(), this);
        getServer().getPluginManager().registerEvents(new portalJump(), this);
        getServer().getPluginManager().registerEvents(new EventCreator(), this);


    }

    @Override
    public void onDisable() {
        System.out.println("[DEV PLUGIN] Plugin Disabling");
    }
}
