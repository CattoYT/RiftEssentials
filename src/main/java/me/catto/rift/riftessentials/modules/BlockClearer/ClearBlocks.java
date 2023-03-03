package me.catto.rift.riftessentials.modules.BlockClearer;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.Bukkit.getLogger;

public class ClearBlocks implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();

        final String executedCommand = "/pos2 66,63,55";
        final String executedCommand2 = "/pos1 13,1,159";
        final String replaceCommand = "/replace stone air";
        boolean firstTime = true;

        if (firstTime) {
           Bukkit.dispatchCommand(console, "/world world");
            Bukkit.dispatchCommand(console, executedCommand);
            Bukkit.dispatchCommand(console, executedCommand2);
        }

        Bukkit.dispatchCommand(console, replaceCommand);

        if (sender instanceof Player) {
            sender.sendMessage("§d[RiftEssentials] Blocks In Scaffold Area Have Been Cleared");
            return true;
        }
        if (sender instanceof Server) {
            getLogger().info("§d[RiftEssentials] Blocks In Scaffold Area Have Been Cleared");
            return true;
        }
        return false;

    }
}
