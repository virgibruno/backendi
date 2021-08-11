package TemplateMethod.menu;

public abstract class Menu {
    double precioBase = 50;

    protected abstract void calcularCosto();
    protected abstract void armarMenu();

    public void procesar(){
        armarMenu();
        calcularCosto();
    }

}
