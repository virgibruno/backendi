package test.com.dh.clinica;

import com.dh.clinica.dao.configuracion.ConfiguracionJDBC;
import com.dh.clinica.dao.impl.OdontologoDaoH2;
import com.dh.clinica.model.Odontologo;
import com.dh.clinica.service.OdontologoService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OdontologoServiceTest {
    private static OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2(new ConfiguracionJDBC()));
    private static Odontologo odontologo1;
    private static Odontologo odontologo2;
    private static Odontologo odontologo3;

    @BeforeAll
    public static void cargarDataSet(){
        odontologo1 = new Odontologo(3698, "Emilio", "Rodriguez");
        odontologo2 = new Odontologo(8876, "Esteban", "Fernandez");
        odontologo3 = new Odontologo(5673, "Lucrecia", "Gimenez");
    }

    @Test
    public void agregarOdontologoTest(){
        odontologoService.guardar(odontologo1);
        odontologoService.guardar(odontologo2);
        odontologoService.guardar(odontologo3);

        assertEquals(1, odontologo1.getId());
        assertEquals(2, odontologo2.getId());
        assertEquals(3, odontologo3.getId());
    }

    @Test
    public void buscarTest(){
        List<Odontologo> odontologos = odontologoService.buscarTodos();

        assertTrue(!odontologos.isEmpty() );
        assertEquals(3, odontologos.size());
    }


}