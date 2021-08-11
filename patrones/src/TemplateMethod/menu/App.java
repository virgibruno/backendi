package TemplateMethod.menu;

public class App {
    public static void main(String[] args) {
        MenuInfantil mi = new MenuInfantil("Milanesa con puré");
        MenuAdulto ma = new MenuAdulto("Pizza");
        MenuVeggie mv = new MenuVeggie("Ensalada");

        mi.procesar();
        ma.procesar();
        mv.procesar();
    }
}
