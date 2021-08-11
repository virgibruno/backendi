package ChainOfResponsability.calidad;

public class CompruebaPeso extends CompruebaCalidad{

    @Override
    protected void realizarPrueba(Articulo a) {
        if(a.getPeso()>1200 && a.getPeso()<1300) {
            this.ckeckNext(a);
        } else{
            System.out.println(a.getNombre() + " es rechazado por el peso.");
        }
    }
}
