package TemplateMethod.menu;

public class MenuAdulto extends Menu{
    private String menu;

    public MenuAdulto(String menu) {
        this.menu = menu;
    }

    @Override
    public void calcularCosto() {
        System.out.println("El precio es $" + precioBase+"\n");
    }

    @Override
    public void armarMenu() {
        System.out.println("Menu: " + menu);
    }
}
