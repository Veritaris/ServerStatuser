package org.dreamfinity.template.Utils;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.dreamfinity.template.Main;

import java.util.List;

public class Utils {
    public Utils() {
    }

    public static void sendLocalizedMessage(Player player, String message) {
        String localizedMsg = Main.getStrings().getString(message);
        if (localizedMsg != null && !localizedMsg.equals("")) {
            player.sendMessage(localizedMsg);
            return;
        }
        player.sendMessage("Нуар опять забыл добавить сообщение (" + message + ")");
    }

    public static void sendLocalizedMessage(CommandSender player, String message) {
        String localizedMsg = Main.getStrings().getString(message);
        if (localizedMsg != null && !localizedMsg.equals("")) {
            player.sendMessage(localizedMsg);
            return;
        }
        player.sendMessage("Нуар опять забыл добавить сообщение (" + message + ")");
    }

    public static void sendLocalizedMessage(CommandSender player, String message, String[] args) {
        String localizedMsg = Main.getStrings().getString(message);
        if (localizedMsg != null && !localizedMsg.equals("")) {

            for (String s : args) {
                localizedMsg = localizedMsg.replaceFirst("%p", s);
            }
            player.sendMessage(localizedMsg);
            return;
        }
        player.sendMessage("Нуар опять забыл добавить сообщение (" + message + ")");
    }

    public static void sendLocalizedMessageList(CommandSender player, String message) {
        List<String> localizedMsgList = Main.getStrings().getStringList(message);
        if (localizedMsgList != null && localizedMsgList.size() != 0) {

            for (String s : localizedMsgList) {
                player.sendMessage(s);
            }
            return;
        }
        player.sendMessage("Нуар опять забыл добавить сообщение (" + message + ")");
    }
}
