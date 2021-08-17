package Flyweight.bosque.arboles;

public class Arbol {
    // atributos
    private int alto;
    private int ancho;
    private String color;
    private String tipo;

    // constructur
    public Arbol(String color) {
        this.color = color;
    }

    //getters y setters
    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
