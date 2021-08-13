package Proxy.drive;

import java.util.ArrayList;
import java.util.List;

public class Drive implements IDrive{

    private List<Documento> documentos = new ArrayList<>();

    @Override
    public Documento traerDocumento(String url, String email) {
        for(Documento d : documentos) {
            if(d.getUrl().equals(url))
                return d;
        }
        return null;
    }
}
