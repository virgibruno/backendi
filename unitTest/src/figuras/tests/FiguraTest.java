package figuras.tests;

import figuras.Circulo;
import figuras.Cuadrado;
import figuras.Figura;
import org.junit.jupiter.api.*;

import static junit.framework.TestCase.assertEquals;

public class FiguraTest {
    Figura figura1;
    Figura figura2;
    Figura figura3;
    Figura figura4;

    @BeforeEach
     void init(){
         figura1 = new Circulo(1);
         figura2 = new Circulo(2);
         figura3 = new Cuadrado(1);
         figura4 = new Cuadrado(2);
     }

    @Test
    void probarPerimetros(){

        assertEquals(2*Math.PI, figura1.calcularPerimetro());
        assertEquals(4*Math.PI, figura2.calcularPerimetro());
        assertEquals(4.0, figura3.calcularPerimetro());
        assertEquals(8.0, figura4.calcularPerimetro());
    }
}
