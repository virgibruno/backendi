package main.com.dh.clinica.service;

import main.com.dh.clinica.dao.IDao;
import main.com.dh.clinica.model.Paciente;

import java.util.List;
import java.util.Optional;

public class PacienteService {

    private IDao<Paciente> pacienteIDao;

    public PacienteService(IDao<Paciente> pacienteIDao) {
        this.pacienteIDao = pacienteIDao;
    }

    public Paciente guardar(Paciente p){
        pacienteIDao.guardar(p);
        return p;
    }
    public Optional<Paciente> buscar(Integer id){
        return pacienteIDao.buscar(id);
    }
    public List<Paciente> buscarTodos(){
        return pacienteIDao.buscarTodos();
    }
    public void eliminar(Integer id){
         pacienteIDao.eliminar(id);
    }
}
