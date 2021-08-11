package TemplateMethod.vendedores.categorias;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends Vendedor{
    private List<Afiliado> afiliados = new ArrayList<>();

    public Empleado(String nombre) {
        super(nombre);
    }

    public Afiliado conseguirAfiliado(String nombre){
        Afiliado a = new Afiliado(nombre);
        afiliados.add( (Afiliado)a);
        return a;
    }

    @Override
    protected int calcularPuntos() {
        return afiliados.size() * 10 + super.getVentas() * 5;
    }
}
