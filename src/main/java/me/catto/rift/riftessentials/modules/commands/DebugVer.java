package me.catto.rift.riftessentials.modules.commands;

import me.catto.rift.riftessentials.RiftEssentials;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;

import java.net.InetAddress;
import java.net.UnknownHostException;

import static org.bukkit.Bukkit.getLogger;
import static org.bukkit.Bukkit.getPlayer;

public class DebugVer implements CommandExecutor {


    private String version = RiftEssentials.getPlugin(RiftEssentials.class).getDescription().getVersion();



    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.AQUA + "[RiftEssentials] " + ChatColor.GOLD + version);
        }
        else {
            getLogger().info("§d[RiftEssentials] " + version);
        }

        return true;
    }

}
