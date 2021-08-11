package TemplateMethod.vendedores;

import TemplateMethod.vendedores.categorias.Empleado;
import TemplateMethod.vendedores.categorias.Vendedor;

public class App {
    public static void main(String[] args) {
        Vendedor emp1 = new Empleado("Lucas");
        Vendedor af1 = ( (Empleado)emp1 ).conseguirAfiliado("Juan");

        emp1.vender();
        emp1.vender();
        emp1.vender();

        emp1.mostrarCategoria();
        af1.mostrarCategoria();
    }
}
