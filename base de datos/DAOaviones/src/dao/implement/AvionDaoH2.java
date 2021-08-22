package dao.implement;

import dao.ConfigurationJdbc;
import dao.IDao;
import model.Avion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AvionDaoH2 implements IDao<Avion> {
    private ConfigurationJdbc configurationJdbc;

    public AvionDaoH2() {
        this.configurationJdbc = new ConfigurationJdbc();
    }

    @Override
    public Avion registrarNuevo(Avion avion) {
        Connection connection = configurationJdbc.conectarConDB();
        String query = String.format("INSERT INTO aviones(MARCA, MATRICULA, FECHA_INICIO) VALUES('%s', '%s', '%s')", avion.getMarca(), avion.getMatricula(), String.valueOf(avion.getFechaEntradaServicio()) );

        try{
            Statement statement = connection.createStatement();
            statement.execute(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if(keys.next())
                avion.setId(keys.getInt("ID"));

        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return avion;
    }

    @Override
    public Avion buscar(int id) {
        Connection connection = configurationJdbc.conectarConDB();
        String query = "SELECT * FROM aviones WHERE ID = " + id;

        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()){
                Avion avion = new Avion(resultSet.getString("MARCA"), resultSet.getString("MATRICULA"), resultSet.getDate("FECHA_INICIO"));
                avion.setId(resultSet.getInt("ID"));
                return avion;
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public List<Avion> buscarTodos() {
        Connection connection = configurationJdbc.conectarConDB();
        String query = "SELECT * FROM aviones";

        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            List<Avion> aviones= new ArrayList<Avion>();
            while (resultSet.next()) {
                Avion avion = new Avion(resultSet.getString("MARCA"), resultSet.getString("MATRICULA"), resultSet.getDate("FECHA_INICIO"));
                avion.setId(resultSet.getInt("ID"));
                aviones.add(avion);
            }
            return aviones;
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public void eliminar(int id) {
        Connection connection = configurationJdbc.conectarConDB();
        String query = String.format("DELETE FROM aviones WHERE ID = '%d'", id);;

        try{
            Statement statement = connection.createStatement();
            statement.execute(query);
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
