package materias.dao.implementaciones;

import materias.dao.ConfiguracionJDBC;
import materias.dao.IDao;
import materias.model.Materia;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MateriaDaoH2 implements IDao<Materia> {
    private ConfiguracionJDBC configuracionJDBC;

    public MateriaDaoH2(ConfiguracionJDBC configuracionJDBC) {
        this.configuracionJDBC = configuracionJDBC;
    }

    @Override
    public Materia guardar(Materia materia) {
        Connection connection = configuracionJDBC.conectarConDB();
        Statement statement = null;
        String query = String.format("INSERT INTO materias(NOMBRE) VALUES ('%s')", materia.getNombre());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if(keys.next())
                materia.setId(keys.getInt(1));
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return materia;
    }

    @Override
    public List<Materia> buscarTodos() {
        Connection connection = configuracionJDBC.conectarConDB();
        Statement statement = null;
        String query = String.format("SELECT * FROM materias");
        List<Materia> materias = new ArrayList<>();

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                materias.add(new Materia(resultSet.getInt("id"), resultSet.getString("nombre")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return materias;
    }
}
