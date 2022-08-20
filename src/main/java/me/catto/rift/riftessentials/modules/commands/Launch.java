package me.catto.rift.riftessentials.modules.commands;

import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import static org.bukkit.Bukkit.getLogger;

public class Launch implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {




        if(sender instanceof Server) {
            getLogger().info("Server is running");
        }
        if(sender instanceof Player p) {
            // Cast the sender

            // Grab the player's vector
            Vector v = p.getVelocity();

            // Apply force in a northern direction, which is negative on the Z-axis in Minecraft
            v.setZ(-20);

            // If the player is on solid ground, friction will dampen the force significantly.
            // To counter this, also push the player slightly upwards in the air
            v.setY(5);

            // Apply our modified vector to the player
            p.setVelocity(v);

            // Add an explosion, just for kicks
            p.getWorld().createExplosion(p.getLocation(), 0);
        }

        return true;
    }

}
