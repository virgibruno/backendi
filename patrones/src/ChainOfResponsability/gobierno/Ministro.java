package ChainOfResponsability.gobierno;

public class Ministro extends Gobernante{

    public Ministro(String nombre) {
        super(nombre, "Ministro");
    }

    @Override
    public void leerDocumento(Documento doc) {
        if (doc.getTipo() <= 2)
            puedeLeer(doc);
        else
            noPuedeLeer(doc);
    }

}
