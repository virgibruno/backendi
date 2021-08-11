package ChainOfResponsability.gobierno;

public class Documento {
    // Atributos
    private String contenido;
    private Integer tipo;

    // Constructor
    public Documento(String contenido, Integer tipo) {
        this.contenido = contenido;
        this.tipo = tipo;
    }

    // Getters
    public Integer getTipo() {
        return tipo;
    }

    public String getContenido() {
        return contenido;
    }
}
