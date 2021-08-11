package Facade.extraccion;

import java.util.ArrayList;
import java.util.List;

public class CuentaService {
    private List<Cuenta> cuentas;

    public CuentaService() {
        cuentas = new ArrayList<>();
    }

    public Cuenta getCuenta( int DNI ) {
        for(Cuenta cuenta : cuentas) {
            if ( DNI == cuenta.getDNI() )
                return cuenta;
        }
        return null;
    }
}
