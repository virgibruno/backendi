package ChainOfResponsability.gobierno;

public class App {
    public static void main(String[] args) {
        Documento doc1 = new Documento("este es un documento reservado.", 1);
        Documento doc2 = new Documento("este es un documento secreto.", 2);
        Documento doc3 = new Documento("este es un documento muy secreto.", 3);

        Gobernante diputado = new Diputado("Marcelo");
        Gobernante ministro = new Ministro("Lucas");
        Gobernante presidente = new Presidente("Alberto");

        diputado.setSgteGobernante(ministro);
        ministro.setSgteGobernante(presidente);

        diputado.procesarDocumento(doc1);
        System.out.println("\n");
        diputado.procesarDocumento(doc2);
        System.out.println("\n");
        diputado.procesarDocumento(doc3);

    }
}
