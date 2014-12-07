package me.mrson.PaidtoWork.Commands;

import me.mrson.PaidtoWork.Base;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Dominic on 12/4/2014.
 */
public class CMD_PaidtoWork implements CommandExecutor{
    private final Base base;
    public CMD_PaidtoWork(Base base){
        this.base = base;
    }

    private String permission = "ptw.main";

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        String command = cmd.getName();

        if(command.equalsIgnoreCase("paidtowork" ) || command.equalsIgnoreCase("ptw")){
            if(player.hasPermission(permission)){

            }
        }

        return false;
    }
}
