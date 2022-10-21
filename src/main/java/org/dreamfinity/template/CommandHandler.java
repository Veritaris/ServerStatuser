package org.dreamfinity.template;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.dreamfinity.template.commands.*;

import java.util.Arrays;

public class CommandHandler implements CommandExecutor {

    public boolean onCommand(final CommandSender sender, final Command command, final String s, final String[] args) {
        sender.sendMessage(String.format("%s issued command %s with args %s", sender.getName(), command, Arrays.toString(args)));
        Main.logger.info(String.valueOf(args.length));

        switch (args.length) {
            case 0:
                Help.use(sender);
                break;
            default:
                UnknownCommand.use(sender);
                break;
        }
        return true;
    }
}
