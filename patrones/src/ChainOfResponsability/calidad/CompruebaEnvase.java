package ChainOfResponsability.calidad;

public class CompruebaEnvase extends CompruebaCalidad{

    @Override
    protected void realizarPrueba(Articulo a) {
        if (a.getEnvasado().equals("sano") || a.getEnvasado().equals("casi sano")) {
            this.ckeckNext(a);
        } else {
            System.out.println(a.getNombre() + " está rechazado por el envase.");
        }
    }
}
