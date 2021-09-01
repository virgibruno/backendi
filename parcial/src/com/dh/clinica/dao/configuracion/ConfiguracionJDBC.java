package com.dh.clinica.dao.configuracion;

import java.sql.*;

public class ConfiguracionJDBC {
    private String jdbcDriver;
    private String dbUrl;
    private String nombreUsuario;
    private String contrasenaUsuario;
    private Connection connection;

    public ConfiguracionJDBC(String jdbcDriver, String dbUrl, String nombreUsuario, String contrasenaUsuario) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.nombreUsuario = nombreUsuario;
        this.contrasenaUsuario = contrasenaUsuario;
    }

    public ConfiguracionJDBC() {
        String pathFile = System.getProperty("user.dir").replace("\\", "/") + "/create.sql";
        this.jdbcDriver = "org.h2.Driver";
        this.dbUrl = "jdbc:h2:tcp://localhost/~/test;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM '" + pathFile + "';";
        this.nombreUsuario = "sa";
        this.contrasenaUsuario = "";
    }

    public Connection conectarConBaseDeDatos() {
        try {
            connection = DriverManager.getConnection(dbUrl, nombreUsuario, contrasenaUsuario);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }


}