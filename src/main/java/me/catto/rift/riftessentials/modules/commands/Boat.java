package me.catto.rift.riftessentials.modules.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Boat implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            ItemStack boat = new ItemStack(Material.OAK_BOAT);

            player.getInventory().addItem(boat);

            player.sendMessage("§6Don't exploit this!");

        }
        return true;
    }
}
