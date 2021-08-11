package ChainOfResponsability.gobierno;

public abstract class Gobernante {
    private Gobernante sgteGobernante;
    private String cargo;
    private String nombre;

    public Gobernante(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public void procesarDocumento(Documento doc) {
        leerDocumento(doc);
        if (getSgteGobernante() != null) {
            System.out.println("Le pasa el documento a: " + getSgteGobernante().toString() + ".");
            getSgteGobernante().procesarDocumento(doc);
        }
    };

    public abstract void leerDocumento(Documento doc);

    public void puedeLeer(Documento doc) {
        System.out.println(this.toString() + " lee el contenido: " + doc.getContenido());
    }

    public void noPuedeLeer(Documento doc) {
        System.out.println(this.toString() + " no puede leer el contenido.");
    }

    public void setSgteGobernante(Gobernante g){
        sgteGobernante = g;
    }

    public Gobernante getSgteGobernante(){
        return sgteGobernante;
    }

    @Override
    public String toString() {
        return cargo + " " + nombre;
    }
}
