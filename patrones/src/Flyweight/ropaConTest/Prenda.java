package Flyweight.ropaConTest;

public class Prenda {
    // atributos
    private String tipo;
    private String talle;
    private boolean esNuevo;
    private boolean importado;

    // constructor
    public Prenda(String tipo) {
        this.tipo = tipo;
    }

    // getters y setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    public boolean isEsNuevo() {
        return esNuevo;
    }

    public void setEsNuevo(boolean esNuevo) {
        this.esNuevo = esNuevo;
    }

    public boolean isImportado() {
        return importado;
    }

    public void setImportado(boolean importado) {
        this.importado = importado;
    }
}
