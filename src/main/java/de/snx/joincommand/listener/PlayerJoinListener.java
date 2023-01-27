package de.snx.joincommand.listener;

import de.snx.joincommand.JoinCommand;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        String command = JoinCommand.getFileManager().getConfigFile().getConfig().getString("JOINCOMMAND.COMMAND");
        Bukkit.getScheduler().runTaskLater(JoinCommand.getInstance(), new Runnable() {
            @Override
            public void run() {
                player.performCommand(command);
            }
        }, 40L);
    }
}
