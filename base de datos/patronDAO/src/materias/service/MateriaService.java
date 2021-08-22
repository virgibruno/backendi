package materias.service;

import materias.dao.IDao;
import materias.model.Materia;

import java.util.List;

public class MateriaService {
    private IDao<Materia> materiaIDao;

    public MateriaService(IDao<Materia> materiaIDao) {
        this.materiaIDao = materiaIDao;
    }

    public Materia guardar(Materia materia) {
        return materiaIDao.guardar(materia);
    }

    public List<Materia> buscarTodas(){
        return materiaIDao.buscarTodos();
    }
}
