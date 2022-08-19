package me.catto.rift.riftessentials.modules.joinMSG;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinMSG implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Bukkit.broadcastMessage(e.getPlayer().getName() + " has joined the server!");
    }


}
