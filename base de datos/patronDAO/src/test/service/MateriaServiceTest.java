package test.service;

import materias.dao.ConfiguracionJDBC;
import materias.dao.implementaciones.MateriaDaoH2;
import materias.model.Materia;
import materias.service.MateriaService;

import org.junit.*;

import java.util.List;

public class MateriaServiceTest {
    private MateriaService materiaService = new MateriaService(new MateriaDaoH2(new ConfiguracionJDBC()));

    @Test
    public void guardarMateria() {
        Materia materia = new Materia("Backend");

        Materia materiaRegistrada = materiaService.guardar(materia);

        Assert.assertTrue(materiaRegistrada.getId() != null);
    }

    @Test
    public void buscarTodas(){
        List<Materia> materias = materiaService.buscarTodas();

        int ultElemento = materias.size() - 1;

        Assert.assertTrue(materias.size() == materias.get( ultElemento ).getId());
    }
}
