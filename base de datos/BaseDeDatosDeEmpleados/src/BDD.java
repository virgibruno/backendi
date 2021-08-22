import java.sql.*;

public class BDD {

    private static final String createTable = "DROP TABLE IF EXISTS EMPLEADO; CREATE TABLE EMPLEADO (ID INT PRIMARY KEY, NOMBRE VARCHAR(200), EDAD INT, EMPRESA VARCHAR(200), FECHAINICIO DATE)";
    private static final String cargarEmpleado = "INSERT INTO EMPLEADO VALUES(?,?,?,?,?)";

    public static void main(String[] args) throws Exception{
        Empleado empleado1 = new Empleado("virginia", 25, "CTD", new Date(20,2,15));
        Empleado empleado2 = new Empleado("lucas", 27, "Mercado Libre", new Date(20,7,15));

        Class.forName("org.h2.Driver");
        Connection connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "SA", "");

        try {

            connection.setAutoCommit(false);

            Statement stat = connection.createStatement();

            stat.execute(createTable);

            PreparedStatement pstat = connection.prepareStatement(cargarEmpleado);
            pstat.setString(1, "1" );
            pstat.setString(2, empleado1.getNombre() );
            pstat.setString(3, String.valueOf(empleado1.getEdad()));
            pstat.setString(4, empleado1.getEmpresa() );
            pstat.setString(5, String.valueOf(empleado1.getFechaDeInicio()) );

            pstat.executeUpdate();

            connection.commit();

            pstat.setString(1, "2" );
            pstat.setString(2, empleado2.getNombre() );
            pstat.setString(3, String.valueOf(empleado2.getEdad()));
            pstat.setString(4, empleado2.getEmpresa() );
            pstat.setString(5, String.valueOf(empleado2.getFechaDeInicio()) );

            pstat.executeUpdate();

            connection.commit();

        } catch (SQLException e) {
            connection.rollback();
            System.err.println("Error: " + e);
        } finally {
            connection.close();
        }



    }
}
