package me.catto.rift.riftessentials.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import static org.bukkit.Bukkit.getLogger;

public class eventListener implements Listener {

    //i legit have no idea what this is or why its needed but it wont work without it soooooooooo
    //i guess it's a bukkit thing
    //cope

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();

        getLogger().info(p.getDisplayName());

        if(p.getDisplayName().equals("Juul_Client")) {
            p.setDisplayName("Server");
            p.setCustomName("Server");
            p.setPlayerListName("Server");
            e.setJoinMessage(ChatColor.YELLOW + p.getDisplayName() + " joined the game");
            getLogger().info("Admin Joined The Game, Changing Name..");
            p.sendMessage("Hi Admin");
        }
    }

}