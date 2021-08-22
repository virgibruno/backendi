import java.util.Date;

public class Empleado {
    private String nombre;
    private int edad;
    private String empresa;
    private Date fechaDeInicio;

    public Empleado(String nombre, int edad, String empresa, Date fechaDeInicio) {
        this.nombre = nombre;
        this.edad = edad;
        this.empresa = empresa;
        this.fechaDeInicio = fechaDeInicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Date getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(Date fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }
}
