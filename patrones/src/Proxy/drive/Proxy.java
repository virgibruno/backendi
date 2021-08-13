package Proxy.drive;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements IDrive{
    private Drive drive;
    private List<Documento> documentos = new ArrayList<>();

    @Override
    public Documento traerDocumento(String url, String email) {
        for(Documento d : documentos) {
            if(d.getUrl().equals(url))
                for(Usuario u : d.getUsuarios()) {
                    if (u.getEmail().equals(email))
                        return this.drive.traerDocumento(url, email);
                    else{
                        System.out.println("No tiene acceso al archivo");
                        return null;
                    }
                }
        }
        return null;
    }
}
