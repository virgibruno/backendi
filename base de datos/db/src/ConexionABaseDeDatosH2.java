import java.sql.*;

public class ConexionABaseDeDatosH2 {
    public static void main(String[] args) throws Exception{

        Class.forName("org.h2.Driver").newInstance();

        Connection c = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");

        Statement s = c.createStatement();

        s.execute("DROP TABLE IF EXISTS MASCOTA; CREATE TABLE MASCOTA(ID INT PRIMARY KEY, NOMBRE VARCHAR(100), DUENIO VARCHAR(200), EDAD INT)");

        s.execute("INSERT INTO MASCOTA VALUES(1, 'MAIA', 'VIRGI', 9)");
        s.execute("INSERT INTO MASCOTA VALUES(2, 'BLAS', 'OSVALDO', 5)");
        s.execute("INSERT INTO MASCOTA VALUES(3, 'ROCCO', 'MARU', 6)");
        s.execute("INSERT INTO MASCOTA VALUES(4, 'NERINA', 'GABI', 3)");
        s.execute("INSERT INTO MASCOTA VALUES(5, 'NEGRO', 'JUAN', 7)");

        ResultSet table = s.executeQuery("SELECT * FROM MASCOTA");

        while (table.next()) {
            System.out.println("La mascota " + table.getString("nombre") + " tiene " + table.getInt("edad") + " años. Su dueño/a es " + table.getString("duenio"));
        }

        c.close();

    }
}
