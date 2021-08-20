import java.sql.*;

public class TestDB {
    public static void main(String[] args) throws Exception{

        Class.forName("org.h2.Driver").newInstance();
        Connection c = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "SA", "");
        Statement stat = c.createStatement();

        String createTable = "DROP TABLE IF EXISTS TEST; CREATE TABLE TEST(ID INT PRIMARY KEY, NAME VARCHAR(255))";

        stat.execute(createTable);

        String insertarFila1 = "INSERT INTO TEST VALUES(1, 'HOLA')";
        String insertarFila2 = "INSERT INTO TEST VALUES(2, 'CHAU')";

        stat.execute(insertarFila1);
        stat.execute(insertarFila2);

        String sql = "SELECT * FROM TEST";

        ResultSet rd = stat.executeQuery(sql);

        while (rd.next()) {
            System.out.println(rd.getInt(1) + " " + rd.getString(2));
        }

        stat.execute("DROP TABLE IF EXISTS PERSONAS; CREATE TABLE PERSONAS(ID INT PRIMARY KEY, NAME VARCHAR(255), LASTNAME VARCHAR(255))");
        stat.execute("INSERT INTO PERSONAS VALUES(1, 'LUCAS', 'GIMENEZ')");
        stat.execute("INSERT INTO PERSONAS VALUES(2, 'VIRGI', 'BRUNO')");
        stat.execute("INSERT INTO PERSONAS VALUES(3, 'MARU', 'BRUNO')");
        stat.execute("INSERT INTO PERSONAS VALUES(4, 'NICO', 'DISANTE')");

        ResultSet rs = stat.executeQuery("SELECT * FROM PERSONAS");
        while (rs.next()){
            System.out.println(rs.getString("name") + " " + rs.getString("LASTNAME"));
        }

        c.close();
    }
}
