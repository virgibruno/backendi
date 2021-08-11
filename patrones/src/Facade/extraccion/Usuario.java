package Facade.extraccion;

public class Usuario {

    private int DNI;
    private int password;

    public Usuario(int DNI, int password) {
        this.DNI = DNI;
        this.password = password;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
