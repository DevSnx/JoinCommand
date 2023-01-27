package de.devsnx.joincommand.listener;

import de.devsnx.joincommand.joincommand;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        String command = joincommand.getFileManager().getConfigFile().getConfig().getString("JOINCOMMAND.COMMAND");
        Bukkit.getScheduler().runTaskLater(joincommand.getInstance(), new Runnable() {
            @Override
            public void run() {
                player.performCommand(command);
            }
        }, 40L);
    }
}
