package Facade.extraccion;

// Esta es la clase facade!
public class Extraccion implements IExtraccion{

    // Atributos: subsistemas o servicios a utilizar
    private AutenticationService autenticationService;
    private CuentaService cuentaService;
    private CajaService cajaService;

    // Constructor

    public Extraccion() {
        autenticationService = new AutenticationService();
        cuentaService = new CuentaService();
        cajaService = new CajaService();
    }

    // Método: comunicación con los subsistemas
    public void retirarDinero(int DNI, String password, double monto){
        if ( autenticationService.validarUsuarioYContrasena(DNI, password) ) {
            Cuenta cuenta = cuentaService.getCuenta(DNI);
            if (cuenta.getSaldo() >= monto){
                cajaService.entregarDinero(monto);
                cuenta.setSaldo(cuenta.getSaldo() - monto);
            } else {
                System.out.println("El saldo es insuficiente");
            }
        } else {
            System.out.println("usuario y contraseña incorrectos");
        }

    }
}
