package service;

import dao.IDao;
import model.Avion;

import java.util.Date;
import java.util.List;

public class AvionService {
    private IDao<Avion> avionIDao;

    public AvionService(IDao<Avion> avionIDao) {
        this.avionIDao = avionIDao;
    }

    public Avion registrarNuevo(String marca, String matricula, Date fechaEntradaServicio){
        Avion avion = new Avion(marca, matricula, fechaEntradaServicio);
        avion = avionIDao.registrarNuevo(avion);
        System.out.println("Se registró el avión con id: " + avion.getId());
        return avion;
    }

    public Avion buscar(int id) {
        Avion avion = avionIDao.buscar(id);
        System.out.println("El avion buscado es: \n" + avion.toString() );
        return avion;
    }

    public List<Avion> buscarTodos(){
        List<Avion> aviones = avionIDao.buscarTodos();
        System.out.println("Los aviones de la flota son: \n");
        for(Avion avion : aviones)
            System.out.println(avion.toString() + "--------------------------- \n");
        return aviones;
    }

    public void eliminar(int id){
        avionIDao.eliminar(id);
    }

}
