package TemplateMethod.menu;

public class MenuVeggie extends Menu{
    private String menu;
    private String adicional = "Condimentos. Packaging especial.";
    private double costoEnvase = 3;
    private double recargo = 0.1;

    public MenuVeggie(String menu) {
        this.menu = menu;
    }

    @Override
    protected void calcularCosto() {
        System.out.println("El precio es $" + (precioBase + costoEnvase)*recargo+"\n");
    }

    @Override
    protected void armarMenu() {
        System.out.println("Menu: " + menu + "\nAgregar: " + adicional);
    }
}
