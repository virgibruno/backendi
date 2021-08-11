package TemplateMethod.procesadorpagos;

import java.util.Date;

public abstract class Procesador {
    // Esta clase deberia tener como atributo una lista de tarjetas. Para simplificar, supongo que es una única tarjeta e incluyo los atributos en esta clase
    private Date fechaExp;
    private int numeroSeguridad;

    public void procesarPago( int numero, double monto ) {
        Date hoy = new Date();
        if ( hoy.before(fechaExp) && numeroSeguridad == numero)
            autorizarPago(monto);
    }

    public abstract void autorizarPago(double monto);

}
