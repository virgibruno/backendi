package TemplateMethod.menu;

public class MenuInfantil extends Menu{
    private String menu;
    private String adicional = "regalo sorpresa";
    private double incremento = 10;

    public MenuInfantil(String menu) {
        this.menu = menu;
    }

    @Override
    protected void calcularCosto() {
        System.out.println("El precio es $" + (precioBase + incremento+"\n"));
    }

    @Override
    protected void armarMenu() {
        System.out.println("Menu: " + menu + "\nAgregar: " + adicional);
    }
}
