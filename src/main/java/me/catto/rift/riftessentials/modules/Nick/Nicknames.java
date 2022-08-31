package me.catto.rift.riftessentials.modules.Nick;

import me.catto.rift.riftessentials.RiftEssentials;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import static org.bukkit.Bukkit.getLogger;

public class Nicknames implements Listener {


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();

        if(p.getName().equals("Juul_Client")) {
            p.setDisplayName("Server");
            getLogger().info("Admin Joined The Game, Changing Name..");
            p.sendMessage("Hi Admin");
        }
    }
}
