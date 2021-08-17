package figuras;

public class Cuadrado implements Figura{

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4*lado;
    }
}
