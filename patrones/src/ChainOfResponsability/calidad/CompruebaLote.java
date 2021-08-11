package ChainOfResponsability.calidad;

public class CompruebaLote extends CompruebaCalidad{

    @Override
    protected void realizarPrueba(Articulo a) {
        if (a.getLote() > 1000 && a.getLote()<2000) {
            this.ckeckNext(a);
        } else {
            System.out.println(a.getNombre() + " es rechazado por el lote.");
        }
    }
}
