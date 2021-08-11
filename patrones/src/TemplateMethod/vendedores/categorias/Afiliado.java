package TemplateMethod.vendedores.categorias;

public class Afiliado extends Vendedor{
    public Afiliado(String nombre) {
        super(nombre);
    }

    @Override
    protected int calcularPuntos() {
        return super.getVentas() * 15;
    }
}
