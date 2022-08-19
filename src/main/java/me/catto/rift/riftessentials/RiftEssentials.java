package me.catto.rift.riftessentials;

import me.catto.rift.riftessentials.events.eventListener;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class RiftEssentials extends JavaPlugin {

    FileConfiguration config = this.getConfig();

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new eventListener(), this);

        //create message in server console saying that the plugin has been enabled
        getLogger().info("RiftEssentials has been enabled!");
        getLogger().info("RiftEssentials: Grabbing Config!");
        this.getConfig();
        getLogger().info("RiftEssentials: Config grabbed!");




    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("RiftEssentials has been shut down!");

        getLogger().info("RiftEssentials: Saving Config!");
        this.saveDefaultConfig();
        getLogger().info("RiftEssentials: Saving Config!");
    }
}
