package TemplateMethod.procesadorpagos;

public class ProcesadorCredito extends Procesador{
    //lo mismo que con procesador: no tendría que tener un limite y saldo utilizado sino una lista de tarjetas de credito, cada cual tendría su propio limite y saldo
    private double limite = 10000;
    private double saldoUtilizado;


    @Override
    public void autorizarPago(double monto) {
        if (monto <= limite - saldoUtilizado) {
            saldoUtilizado += monto;
            System.out.println("El pago fue realizado con exito");
        }
        else
            System.out.println("Saldo insuficiente");
    }
}
