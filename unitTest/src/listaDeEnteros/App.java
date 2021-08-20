package listaDeEnteros;

public class App {
    public static void main(String[] args) throws Exception{
        Lista l = new Lista();
        l.calcularPromedio();
        l.agregarNumero(1);
        l.agregarNumero(3);
        l.agregarNumero(5);
        l.agregarNumero(7);
        l.agregarNumero(2);
        l.agregarNumero(2);
        l.agregarNumero(2);
        l.agregarNumero(2);
        l.agregarNumero(2);
        l.agregarNumero(8);
        l.agregarNumero(2);

        l.buscarMaximo();
        l.buscarMinimo();

    }
}
