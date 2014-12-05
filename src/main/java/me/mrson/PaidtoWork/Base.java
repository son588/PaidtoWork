package me.mrson.PaidtoWork;

import me.mrson.PaidtoWork.Commands.CMD_PaidtoWork;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Dominic on 12/4/2014.
 */
public class Base extends JavaPlugin{
    Logger logger;
    Plugin plugin;

    @Override
    public void onEnable(){
        plugin = this;
        logger.log(Level.FINEST, "[PaidtoWork] Is now enabled");

        this.getCommand("s").setExecutor(new CMD_PaidtoWork(this));
    }
    public void onDisable(){
        logger.log(Level.FINEST, "[PaidtoWork] is now disabled.");
    }

    public static void getPlugin(){
        Plugin plugin;
    }


}
