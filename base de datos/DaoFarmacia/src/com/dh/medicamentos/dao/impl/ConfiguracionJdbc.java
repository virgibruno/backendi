package com.dh.medicamentos.dao.impl;

import java.sql.*;

public class ConfiguracionJdbc {
    private String jdbcDriver;
    private String url;
    private String user;
    private String password;

    public ConfiguracionJdbc() {
        this.jdbcDriver = "org.h2.Driver";
        this.url = "jdbc:h2:tcp://localhost/~/test;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'create.sql'\"";
        this.user = "sa";
        this.password = "";
    }

    public ConfiguracionJdbc(String jdbcDriver, String url, String user, String password) {
        this.jdbcDriver = jdbcDriver;
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public Connection conectarConDB(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return connection;
    }

}
