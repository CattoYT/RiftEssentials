package me.catto.rift.riftessentials.modules.commands;

import me.catto.rift.riftessentials.modules.BowBoost.BowBoost;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class RiftEssentialsCmds implements CommandExecutor {



    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage("Only players can run this command !");
            return false;
        }
        Player p = (Player) sender;
        if(args[0].equalsIgnoreCase("setBowBoostSpeed")) {
            if (args.length == 1) {
                p.sendMessage(ChatColor.RED + "You forgot a value!");
                return false;
            }

            double bowBoostSpeed = 1.6;
            try {
                bowBoostSpeed = Double.parseDouble(args[1]);
            } catch (Exception e) {
                p.sendMessage(ChatColor.RED + "Unknown arguments !");
                return false;
            }

            BowBoost.setBowVelocity(bowBoostSpeed);
            p.sendMessage(ChatColor.GREEN + "Written!");
            return true;


        } else { // unknow sub command
            p.sendMessage(ChatColor.RED + "Unknown arguments !");

        }
        return false;
    }

}
