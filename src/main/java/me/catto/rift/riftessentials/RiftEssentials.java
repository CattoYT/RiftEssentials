package me.catto.rift.riftessentials;

import me.catto.rift.riftessentials.events.eventListener;
import me.catto.rift.riftessentials.modules.BlockClearer.ClearBlocks;
import me.catto.rift.riftessentials.modules.BowBoost.BowBoost;
import me.catto.rift.riftessentials.modules.commands.*;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.net.InetAddress;
import java.net.UnknownHostException;


public final class RiftEssentials extends JavaPlugin {

    FileConfiguration config = this.getConfig();



    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new eventListener(), this);
        getServer().getPluginManager().registerEvents(new BowBoost(), this);
        //create message in server console saying that the plugin has been enabled
        getLogger().info("RiftEssentials has been enabled!");
        this.getConfig();

        //register commands
        getLogger().info("RiftEssentials: Registering commands!");

        getCommand("book").setExecutor(new BookQuill());
        getCommand("nametag").setExecutor(new Nametag());
        getCommand("minecart").setExecutor(new Minecart());
        getCommand("boat").setExecutor(new Boat());
        getCommand("clearblocks").setExecutor(new ClearBlocks());
        getCommand("version").setExecutor(new DebugVer());

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





    }





}
