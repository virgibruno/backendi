package com.dh.medicamentos.dao.impl;

import com.dh.medicamentos.dao.IDao;
import com.dh.medicamentos.model.Medicamento;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MedicamentoDaoH2 implements IDao<Medicamento> {
    private ConfiguracionJdbc configuracionJdbc;
    final static Logger log = Logger.getLogger(MedicamentoDaoH2.class);

    public MedicamentoDaoH2() {
        this.configuracionJdbc = new ConfiguracionJdbc();
    }

    @Override
    public Medicamento guardar(Medicamento medicamento) {
        log.debug("Registrando nuevo medicamento..." + medicamento.toString());

        Connection connection = configuracionJdbc.conectarConDB();
        Statement statement = null;
        String query= String.format("INSERT INTO medicamentos(nombre, laboratorio, cantidad, precio) VALUES ('%s', '%s', '%s', '%s')",
                medicamento.getNombre(), medicamento.getLaboratorio(), medicamento.getCantidad(), medicamento.getPrecio());

        try{
            connection.setAutoCommit(false);
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if(keys.next()) {
                medicamento.setId(keys.getInt(1));
            }
            connection.commit();
            connection.setAutoCommit(true);
            statement.close();
            connection.close();

        } catch (SQLException e) {
            log.error("No se generó correctamente el registro del medicamento",e);
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
                log.error("Error al intentar volver atrás.", ex);
            }
        }
        return medicamento;
    }

    @Override
    public Medicamento buscar(Integer id) {
        log.debug("Buscando medicamento con id: "+ id);

        Connection connection = configuracionJdbc.conectarConDB();
        Statement statement;
        String query= String.format("SELECT * FROM medicamentos WHERE id = "+ id);
        Medicamento medicamento = null;

        try{
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()) {
                medicamento = new Medicamento(rs.getInt("id"),rs.getString("nombre"),
                        rs.getString("laboratorio"),rs.getInt("cantidad"),rs.getDouble("precio"));
            }
            statement.close();
            connection.close();

        } catch (SQLException e) {
            log.error("No se generó correctamente el registro del medicamento",e);
            e.printStackTrace();
        }
        return medicamento;

    }
}
