package logger2;

public class Leon extends Animal{
    private boolean esAlfa;

    public Leon(String nombre, int edad, boolean esAlfa) {
        super(nombre, edad);
        this.esAlfa = esAlfa;
    }

    @Override
    public void esMayourA10() {
        if(super.getEdad() > 10 && this.esAlfa) {
            Animal.getLogger().info(super.getNombre() + " es mayor a 10 años y es el alfa.");
        }
    }
}
