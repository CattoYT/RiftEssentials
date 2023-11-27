package me.catto.rift.riftessentials.modules.TabCompleter;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class RiftEssentialsTabCompleter implements TabCompleter {
    @Override
    public List<String> onTabComplete (CommandSender sender, Command cmd, String label, String[] args) {
        List<String> l = new ArrayList<String>();
        if (cmd.getName().equalsIgnoreCase("riftessentials") && args.length >= 0) {
            if (sender instanceof Player) {
                Player player = (Player) sender;

                List<String> list = new ArrayList<>();
                l.add("help");

                if (player.hasPermission("RiftEssentials.admin")) {
                    l.add("setBowBoostSpeed");
                }
                return l;

            }
        }
        return l;
    }
}
