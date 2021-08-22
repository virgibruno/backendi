package test;

import dao.ConfigurationJdbc;
import dao.implement.AvionDaoH2;
import service.AvionService;

import java.sql.*;


public class Main {
    public static void main(String[] args) throws Exception{
        AvionService avionService = new AvionService(new AvionDaoH2());

//        avionService.registrarNuevo("pipi", "H3JX", new Date(20,01,23));
//        avionService.registrarNuevo("pepe", "HJK55", new Date(20,03,25));

        avionService.buscar(2);

        avionService.buscarTodos();

        avionService.eliminar(1);
    }
}
