package Proxy.series.clases;

public class Serie implements ISerie{
    private String nombre;

    public Serie(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getLink(String nombre) {
        return "www."+ nombre +".com";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
