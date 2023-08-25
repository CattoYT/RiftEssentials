package me.catto.rift.riftessentials.modules.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import java.io.Console;
import java.net.InetAddress;
import java.net.UnknownHostException;

import static org.bukkit.Bukkit.getLogger;

public class GetIP implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {


            try {
                getLogger().info("§d[RiftEssentials] " + InetAddress.getLocalHost().getHostAddress());
            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            }

        return true;
    }
}
