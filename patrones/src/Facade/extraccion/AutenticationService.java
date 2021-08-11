package Facade.extraccion;

import java.util.List;

public class AutenticationService {
    private List<Usuario> usuarios;


    public boolean validarUsuarioYContrasena(int DNI, String password) {
        for(Usuario usuario:usuarios){
            if ( DNI == usuario.getDNI() && password.equals( usuario.getPassword() ) )
                return true;
        }
        return false;
    }
}
