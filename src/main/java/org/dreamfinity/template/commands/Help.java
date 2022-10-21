package org.dreamfinity.template.commands;

import org.bukkit.command.CommandSender;
import org.dreamfinity.template.Utils.Utils;

public class Help {
    public static void use(final CommandSender sender) {
        Utils.sendLocalizedMessageList(sender, "Help");
    }
}
