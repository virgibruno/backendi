package primerTest;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @Test
    void mostrarNombreCompletoTest(){
        Persona prueba = new Persona("Virginia", "Bruno", "", 0);
        assertEquals( "Bruno, Virginia", prueba.mostrarNombreCompleto());
    }

    @Test
    void esMayorTest(){
        Persona mayor = new Persona("","","",19);
        Persona menor = new Persona("","","", 17);
        assertTrue(mayor.esMayor());
        assertFalse(menor.esMayor());
    }

}