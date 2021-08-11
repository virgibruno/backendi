package ChainOfResponsability.calidad;

public class App {
    public static void main(String[] args) {
        Articulo a = new Articulo("Pelota",1001,1250,"masosano");

        CompruebaCalidad lote = new CompruebaLote();
        CompruebaCalidad peso = new CompruebaPeso();
        CompruebaCalidad envase = new CompruebaEnvase();

        lote.setSgtePrueba(peso);
        peso.setSgtePrueba(envase);

        lote.realizarPrueba(a);
    }
}
