package de.snx.joincommand;

import de.snx.joincommand.listener.PlayerJoinListener;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class JoinCommand extends JavaPlugin{

    public static JoinCommand instance;
    public static FileManager fileManager;

    @Override
    public void onEnable(){
        instance = this;
        fileManager = new FileManager();
        PluginManager load = Bukkit.getPluginManager();
        load.registerEvents(new PlayerJoinListener(), this);
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    public static JoinCommand getInstance() {
        return instance;
    }

    public static FileManager getFileManager() {
        return fileManager;
    }
}