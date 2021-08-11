package Facade.extraccion;

public class Cuenta {
    private int DNI;
    private double saldo;

    public Cuenta(int DNI) {
        this.DNI = DNI;
        saldo = 0;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
