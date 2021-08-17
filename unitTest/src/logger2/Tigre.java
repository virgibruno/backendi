package logger2;

public class Tigre extends Animal{

    public Tigre(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void esMayourA10() {
        if(super.getEdad() > 10) {
            Animal.getLogger().info(super.getNombre() + " es mayor a 10 años");
        }
    }
}
