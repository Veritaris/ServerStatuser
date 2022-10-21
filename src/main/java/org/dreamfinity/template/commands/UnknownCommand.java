package org.dreamfinity.template.commands;

import org.bukkit.command.CommandSender;
import org.dreamfinity.template.Utils.Utils;

public class UnknownCommand {
    public static void use(CommandSender sender, String subcommand) {
        Utils.sendLocalizedMessage(sender, "message.unknownCommand", new String[]{subcommand});
    }

    public static void use(CommandSender sender) {
        Utils.sendLocalizedMessage(sender, "Неизвестная команда!");
    }

}
