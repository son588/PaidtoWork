package me.mrson.PaidtoWork.Commands;

import me.mrson.PaidtoWork.Base;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Created by Dominic on 12/4/2014.
 */
public class CMD_PaidtoWork implements CommandExecutor{
    private final Base base;

    public CMD_PaidtoWork(Base base){
        this.base = base;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        return false;
    }
}
