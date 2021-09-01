package dao;

import java.sql.*;

public class ConfigurationJdbc {
    private String jdbcDriver;
    private String dbUrl;
    private String user;
    private String password;

    public ConfigurationJdbc(String jdbcDriver, String dbUrl, String user, String password) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.user = user;
        this.password = password;
    }

    public ConfigurationJdbc() {
        this.jdbcDriver = "org.h2.Driver";
        this.dbUrl ="jdbc:h2:tcp://localhost/~/test;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'C:/Users/virgi/Documents/CTD/3er_bimestre/BackendI/base de datos/DAOaviones/create.sql'";
        this.user = "sa";
        this.password = "";
    }

    public Connection conectarConDB(){
        try {
            Class.forName(jdbcDriver);
            Connection c = DriverManager.getConnection(dbUrl, user, password);
            return c;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
