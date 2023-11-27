package me.catto.rift.riftessentials.modules.ServerCommandRunner;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class ServerCommandRunner implements Listener {


    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e) {

        Bukkit.getServer().getOnlinePlayers().size();

        if(Bukkit.getServer().getOnlinePlayers().size() == 0) {

        }

    }



}
