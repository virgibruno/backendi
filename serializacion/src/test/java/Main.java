import com.dh.serializacion.Dia;
import com.dh.serializacion.Perro;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Perro perro1 = new Perro("maia", "boxer", 8, "calle falsa 123");
        Perro perro2 = new Perro("blas", "boxer", 5, "calle falsa 123");

        Dia lunes = new Dia("lunes");
        lunes.agregarPerro(perro1);
        lunes.agregarPerro(perro2);


        FileOutputStream fo = new FileOutputStream("Perros.txt");
        ObjectOutputStream oo = new ObjectOutputStream(fo);
        oo.writeObject(lunes);

        oo.close();

        FileInputStream fi = new FileInputStream("Perros.txt");
        ObjectInputStream oi = new ObjectInputStream(fi);

        System.out.println(oi.readObject());

        oi.close();

    }
}
