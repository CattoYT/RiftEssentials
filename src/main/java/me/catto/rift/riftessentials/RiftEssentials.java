package me.catto.rift.riftessentials;

import me.catto.rift.riftessentials.events.eventListener;
import me.catto.rift.riftessentials.modules.commands.Launch;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.LivingEntity;
import org.bukkit.plugin.java.JavaPlugin;


public final class RiftEssentials extends JavaPlugin {

    FileConfiguration config = this.getConfig();





    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new eventListener(), this);

        //create message in server console saying that the plugin has been enabled
        getLogger().info("RiftEssentials has been enabled!");
        this.getConfig();

        //register commands
        getLogger().info("RiftEssentials: Registering commands!");
        registerCommands();

        createConfig();


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("RiftEssentials has been shut down!");

        getLogger().info("RiftEssentials: Saving Config!");
        this.saveDefaultConfig();
    }

    //register your fucking commands here
    private void registerCommands() {

        this.getCommand("Launch").setExecutor(new Launch());


    }

    private void createConfig() {
        config.addDefault("configVersion", "1.0");
        config.addDefault("BowBoost", true);
        config.addDefault("Launch", true);

        config.options().copyDefaults(true);
        saveConfig();
    }

}
