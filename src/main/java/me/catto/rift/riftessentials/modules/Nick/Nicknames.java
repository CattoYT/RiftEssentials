package me.catto.rift.riftessentials.modules.Nick;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import static org.bukkit.Bukkit.getLogger;

public class Nicknames implements Listener {


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();

        if(p.getName().equals("CattoYT")) {
            p.setDisplayName("Rift Admin");
            getLogger().info("§dAdmin Joined The Game, Changing Name..");
            p.sendMessage("§dHi Admin");
        }
    }
}
