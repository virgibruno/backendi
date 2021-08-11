package ChainOfResponsability.gobierno;

public class Diputado extends Gobernante{

    public Diputado(String nombre) {
        super(nombre, "Diputado");
    }

    @Override
    public void leerDocumento(Documento doc) {
        if (doc.getTipo() == 1)
            puedeLeer(doc);
        else
            noPuedeLeer(doc);
    }

}
