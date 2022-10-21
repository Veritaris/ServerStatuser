package org.dreamfinity.template;

import org.bukkit.command.CommandExecutor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.dreamfinity.template.Utils.MysqlConnection;

import java.io.File;
import java.util.logging.Logger;

public class Main extends JavaPlugin {
    private static YamlConfiguration strings;
    private static MysqlConnection connection;
    private static Main instance;

    public static Logger logger;
    
    public void onEnable() {
        logger = getLogger();

        logger.info("Loading template plugin...");

        Main.instance = this;
        Main.connection = new MysqlConnection();

        this.setupConfigs();
        this.registerEvents();
        this.getCommand("template").setExecutor(new CommandHandler());

        logger.info("Oh yeah, best plugin has been loaded");
    }
    
    public void onDisable() {
        logger.info("Pls no((");
    }
    
    private void registerEvents() {
        final PluginManager pm = this.getServer().getPluginManager();
    }
    
    public void setupConfigs() {
        this.saveResource("strings.yml", false);
        Main.strings = YamlConfiguration.loadConfiguration(new File(this.getDataFolder(), "strings.yml"));
        this.saveDefaultConfig();
    }

    
    public static Main getInstance() {
        return Main.instance;
    }
    
    public MysqlConnection getConnection() {
        return Main.connection;
    }
    
    public static YamlConfiguration getStrings() {
        return Main.strings;
    }
}
