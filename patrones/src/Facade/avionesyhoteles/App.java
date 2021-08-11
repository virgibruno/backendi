package Facade.avionesyhoteles;

import Facade.avionesyhoteles.facade.CheckFacade;

public class App {
    public static void main(String[] args) {
        CheckFacade cliente = new CheckFacade();

        cliente.buscar("2/8/2021", "2/9/2021", "Santa Fe", "Buenos Aires");
    }
}
