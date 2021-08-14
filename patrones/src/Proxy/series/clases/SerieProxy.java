package Proxy.series.clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SerieProxy implements ISerie{
    private int maximo = 2;
    private List<Serie> series = new ArrayList<>();
    private HashMap<Serie, Integer> cantVistas = new HashMap();

    private Serie buscarSerie(String nombre) {
        for(Serie s : series) {
            if(nombre.equals(s.getNombre()))
                return s;
        }
        return null;
    }

    @Override
    public String getLink(String nombre) throws SerieNoHabilitadaException {
        Serie s = buscarSerie(nombre);
        if ( s == null ) {
            System.out.println("creando nueva serie...");
            s = new Serie(nombre);
            series.add(s);
            cantVistas.put(s, 0);
        }

        Integer n = cantVistas.get(s);

        if (n < maximo) {
            cantVistas.remove(s);
            cantVistas.put(s, n+1);
            return s.getLink(nombre);
        } else {
            throw new SerieNoHabilitadaException();
        }
    }
}
