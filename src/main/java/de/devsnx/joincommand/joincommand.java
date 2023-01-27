package de.devsnx.joincommand;

import de.devsnx.joincommand.listener.PlayerListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class joincommand extends JavaPlugin{

    public static joincommand instance;
    public static FileManager fileManager;

    @Override
    public void onEnable(){
        instance = this;
        fileManager = new FileManager();
        PluginManager load = Bukkit.getPluginManager();
        load.registerEvents(new PlayerListener(), this);
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    public static joincommand getInstance() {
        return instance;
    }

    public static FileManager getFileManager() {
        return fileManager;
    }
}