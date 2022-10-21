package org.dreamfinity.template.Utils;

import org.dreamfinity.template.Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection {
    private Connection connection;
    private String url;
    private String user;
    private String pass;
    
    public MysqlConnection() {
        this.user = Main.getInstance().getConfig().getString("Mysql.user");
        this.pass = Main.getInstance().getConfig().getString("Mysql.password");
        final String host = Main.getInstance().getConfig().getString("Mysql.host");
        final String port = Main.getInstance().getConfig().getString("Mysql.port");
        final String name = Main.getInstance().getConfig().getString("Mysql.name");
        this.url = String.format("jdbc:mysql://%s:%s/%s", host, port, name);
    }
    
    private Connection getConnection() {
        try {
            return DriverManager.getConnection(this.url, this.user, this.pass);
        }
        catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
