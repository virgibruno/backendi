package ChainOfResponsability.calidad;

public abstract class CompruebaCalidad {

    private CompruebaCalidad sgtePrueba;

    public CompruebaCalidad getSgtePrueba() {
        return sgtePrueba;
    }

    public void setSgtePrueba(CompruebaCalidad sgtePrueba) {
        this.sgtePrueba = sgtePrueba;
    }

    protected abstract void realizarPrueba(Articulo a);

    protected void ckeckNext(Articulo a) {
        if( this.sgtePrueba == null) {
            System.out.println(a.getNombre() + " está aprobado.");
        } else {
            this.sgtePrueba.realizarPrueba(a);
        }
    }

}
