package primerTest;

public class Persona {
    // atributos
    private String nombre;
    private String apellido;
    private String email;
    private int edad;

    // constructor
    public Persona(String nombre, String apellido, String email, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.edad = edad;
    }

    // metodos
    public String mostrarNombreCompleto(){
        return this.apellido + ", " + this.nombre;
    }

    public boolean esMayor() {
        return edad > 18;
    }

}
