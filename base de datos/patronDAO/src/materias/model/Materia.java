package materias.model;

public class Materia {
    // atributos
    private Integer id;
    private String nombre;

    // constructor
    public Materia(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    // getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
