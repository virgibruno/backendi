package TemplateMethod.procesadorpagos;

public class ProcesadorDebito extends Procesador{
    //lo mismo que con procesador: no tendría que tener un saldo sino una lista de tarjetas de credito, cada cual tendría su propio saldo
    private double saldo;


    @Override
    public void autorizarPago(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("El pago fue realizado con exito");
        }
        else
            System.out.println("Saldo insuficiente");
    }
}