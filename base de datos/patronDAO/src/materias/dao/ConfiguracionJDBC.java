package materias.dao;

import java.sql.*;

public class ConfiguracionJDBC {
    // atributos
    private String jdbcDriver;
    private String dbUrl;
    private String usuario;
    private String password;

    // constructores
    public ConfiguracionJDBC(String jdbcDriver, String dbUrl, String usuario, String password) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.usuario = usuario;
        this.password = password;
    }

    public ConfiguracionJDBC() {
        this.jdbcDriver = "org.h2.Driver";
        this.dbUrl = "jdbc:h2:tcp://localhost/~/test;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'C:/Users/virgi/Documents/CTD/3er_bimestre/BackendI/base de datos/patronDAO/create.sql'";
        this.usuario = "sa";
        this.password = "";
    }

    // método
    public Connection conectarConDB(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbUrl, usuario, password);
//            Statement stat = connection.createStatement();
//            stat.execute("CREATE TABLE IF NOT EXISTS materias (ID INT AUTO_INCREMENT PRIMARY KEY, NOMBRE VARCHAR(255))");
        } catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return connection;
    }
}
