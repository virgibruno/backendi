package com.dh.clinica.dao.impl;

import com.dh.clinica.dao.IDao;
import com.dh.clinica.dao.configuracion.ConfiguracionJDBC;
import com.dh.clinica.model.Odontologo;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class OdontologoDaoH2 implements IDao<Odontologo> {
    // atributos
    private ConfiguracionJDBC configuracionJDBC;
    private Logger logger = Logger.getLogger(OdontologoDaoH2.class);



    // constructor

    public OdontologoDaoH2(ConfiguracionJDBC configuracionJDBC) {
        this.configuracionJDBC = configuracionJDBC;
    }

    // implementación métodos interfaz
    @Override
    public Odontologo guardar(Odontologo odontologo) {
        Connection connection = configuracionJDBC.conectarConBaseDeDatos();
        Statement stmt = null;
        String query = String.format("INSERT INTO odontologos(matricula, nombre, apellido) VALUES('%s', '%s', '%s')",
                odontologo.getMatricula(), odontologo.getNombre(), odontologo.getApellido());
        try{
            stmt = connection.createStatement();
            stmt.execute(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = stmt.getGeneratedKeys();
            if (keys.next())
                odontologo.setId(keys.getInt("id"));
            stmt.close();
            connection.close();
            logger.debug("Odontólogo cargado en la base de datos. Id: " + odontologo.getId());

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            logger.error("Error al guardar odontologo.");
        }

        return odontologo;
    }

    @Override
    public List<Odontologo> buscarTodos() {
        Connection connection = configuracionJDBC.conectarConBaseDeDatos();
        Statement stmt = null;
        String query = "SELECT * FROM odontologos";
        List <Odontologo> odontologos = new ArrayList<>();
        try {
            stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(query);
            while(resultSet.next()){
                odontologos.add(crearOdontologo(resultSet));
            }
            stmt.close();
            connection.close();
            logger.debug("Se realiza consulta a la base de datos.");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            logger.error("Error al intentar buscar todos los odontólogos");
        }

        return odontologos;
    }

    private Odontologo crearOdontologo(ResultSet resultSet) throws SQLException{
        Integer id = resultSet.getInt("id");
        Integer matricula = resultSet.getInt("matricula");
        String nombre = resultSet.getString("nombre");
        String apellido = resultSet.getString("apellido");
        return new Odontologo(id, matricula, nombre, apellido);
    }

    // getters y setters
    public ConfiguracionJDBC getConfiguracionJDBC() {
        return configuracionJDBC;
    }

    public void setConfiguracionJDBC(ConfiguracionJDBC configuracionJDBC) {
        this.configuracionJDBC = configuracionJDBC;
    }
}
