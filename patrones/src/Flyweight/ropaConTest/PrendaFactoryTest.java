package Flyweight.ropaConTest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PrendaFactoryTest {
    static Prenda pantalon;
    static Prenda remera;
    static Prenda corpinio;


    @BeforeAll
    static void init(){
        pantalon = PrendaFactory.getInstance().getPrenda("pantalon");
        pantalon.setTalle("XS");
        pantalon.setImportado(false);
        pantalon.setEsNuevo(true);

        remera = PrendaFactory.getInstance().getPrenda("remera");
        remera.setTalle("S");
        remera.setImportado(true);
        remera.setEsNuevo(false);

        corpinio = PrendaFactory.getInstance().getPrenda("corpinio");
        corpinio.setTalle("M");
        corpinio.setImportado(false);
        corpinio.setEsNuevo(false);
    }

    @Test
    void obtenerElementos(){
        assertEquals("pantalon", pantalon.getTipo());
        assertEquals("remera", remera.getTipo());
        assertEquals("corpinio", corpinio.getTipo());
    }

    @Test
    void cantPrendas(){
        Prenda pantalon2 = PrendaFactory.getInstance().getPrenda("pantalon");
        Prenda remera2 = PrendaFactory.getInstance().getPrenda("remera");
        Prenda corpinio2 = PrendaFactory.getInstance().getPrenda("corpinio");
        int cantidadPedidos = 6;

        assertTrue(PrendaFactory.getInstance().getPrendas().size() < cantidadPedidos);
    }
}