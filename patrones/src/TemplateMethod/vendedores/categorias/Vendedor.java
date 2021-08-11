package TemplateMethod.vendedores.categorias;

public abstract class Vendedor {
    // Atributos
    private String categoria;
    private String nombre;
    private int ventas;

    // Constructor
    public Vendedor(String nombre) {
        this.nombre = nombre;
        ventas = 0;
    }

    // Métodos
    protected abstract int calcularPuntos();

    private void recategorizar(int puntos) {
        if (puntos < 20)
            this.categoria = "novato";
        else if (puntos < 30)
            this.categoria = "aprendiz";
        else if (puntos < 40)
            this.categoria = "bueno";
        else
            this.categoria = "maestro";
    }

    public void mostrarCategoria(){
        int puntos = calcularPuntos();
        recategorizar( puntos );
        System.out.println(this.nombre + " tiene un total de " + puntos + " puntos, categoriza como " + this.categoria + ".");
    }

    public void vender(){
        ventas++;
    }

    public int getVentas() {
        return ventas;
    }

}
