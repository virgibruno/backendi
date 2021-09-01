package com.dh.clinica.service;

import com.dh.clinica.dao.IDao;
import com.dh.clinica.model.Odontologo;
import org.apache.log4j.Logger;

import java.util.List;

public class OdontologoService {
    // atributos
    private IDao<Odontologo> odontologoIDao;
    private Logger logger;

    // constructor

    public OdontologoService(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
        logger = Logger.getLogger(OdontologoService.class);
    }


    // métodos
    public Odontologo guardar(Odontologo odontologo){
        odontologoIDao.guardar(odontologo);
        logger.info("Se incorporó nuevo odontólogo:" + odontologo.toString() );
        return odontologo;
    }

    public List<Odontologo> buscarTodos(){
        List<Odontologo> odontologos = odontologoIDao.buscarTodos();
        logger.info(listar(odontologos));
        return odontologos;
    }

    private String listar(List<Odontologo> odontologos){
        String lista = "Los odontólgos son:";
        for(Odontologo odontologo : odontologos){
            lista += odontologo.toString();
        }
        return lista;
    }
    // getters y setters

    public IDao<Odontologo> getOdontologoIDao() {
        return odontologoIDao;
    }

    public void setOdontologoIDao(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }
}
