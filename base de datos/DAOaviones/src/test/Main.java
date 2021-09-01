package test;

import dao.implement.AvionDaoH2;
import service.AvionService;

public class Main {
    public static void main(String[] args) {
        AvionService avionService = new AvionService(new AvionDaoH2());

        avionService.registrarNuevo("pipi", "H3JX", 2020, 03, 7);
        avionService.registrarNuevo("pepe", "HJK55", 2020, 03, 15);

        avionService.buscar(2);

        avionService.buscarTodos();

        avionService.eliminar(1);
    }
}
