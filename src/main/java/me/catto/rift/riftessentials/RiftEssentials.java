package me.catto.rift.riftessentials;

import me.catto.rift.riftessentials.events.eventListener;
import me.catto.rift.riftessentials.modules.BlockClearer.ClearBlocks;
import me.catto.rift.riftessentials.modules.BowBoost.BowBoost;
import me.catto.rift.riftessentials.modules.TabCompleter.RiftEssentialsTabCompleter;
import me.catto.rift.riftessentials.modules.commands.*;
import org.bukkit.plugin.java.JavaPlugin;


public final class RiftEssentials extends JavaPlugin {




    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new eventListener(), this);
        getServer().getPluginManager().registerEvents(new BowBoost(), this);
        //create message in server console saying that the plugin has been enabled
        getLogger().info("RiftEssentials has been enabled!");

        configManager(true);

        //register commands
        getLogger().info("RiftEssentials: Registering commands!");


        getCommand("book").setExecutor(new BookQuill());
        getCommand("nametag").setExecutor(new Nametag());
        getCommand("minecart").setExecutor(new Minecart());
        getCommand("boat").setExecutor(new Boat());
        getCommand("clearblocks").setExecutor(new ClearBlocks());
        getCommand("version").setExecutor(new DebugVer());
        getCommand("riftessentials").setExecutor(new RiftEssentialsCmds());

        getCommand("riftessentials").setTabCompleter(new RiftEssentialsTabCompleter());


    }

    private void configManager(boolean StartUp) {

        if (StartUp) {
            saveDefaultConfig();
            BowBoost.setBowVelocity(getConfig().getDouble("bowBoostVelocity"));
        }
        else {
            getConfig().set("bowBoostVelocity", BowBoost.getBowVelocity());
            saveConfig();
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("RiftEssentials has been shut down!");
        configManager(false);
    }

    //register your fucking commands here
    private void registerCommands() {





    }





}
