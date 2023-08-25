package me.catto.rift.riftessentials.modules.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.UUID;

public class Minecart implements CommandExecutor {

    private final HashMap<UUID, Long> cooldown = new HashMap<>();



    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (!this.cooldown.containsKey(player.getUniqueId())) {
                this.cooldown.put(player.getUniqueId(), System.currentTimeMillis());

                ItemStack Minecart = new ItemStack(Material.MINECART);

                player.getInventory().addItem(Minecart);

                player.sendMessage(ChatColor.AQUA + "[RiftEssentials] " + ChatColor.GOLD + "Don't exploit this!");
            }
            else {
                long timeElapsed = System.currentTimeMillis() - cooldown.get(player.getUniqueId());

                if (timeElapsed > 600000) {
                    this.cooldown.put(player.getUniqueId(), System.currentTimeMillis());

                    ItemStack Minecart = new ItemStack(Material.MINECART);

                    player.getInventory().addItem(Minecart);

                    player.sendMessage(ChatColor.AQUA + "[RiftEssentials] " + ChatColor.GOLD + "Don't exploit this!");

                }
            }


        }
        return true;
    }
}
