package ChainOfResponsability.gobierno;

public class Presidente extends Gobernante{

    public Presidente(String nombre) {
        super(nombre, "Presidente");
    }

    @Override
    public void leerDocumento(Documento doc) {
        puedeLeer(doc);
    }

}
