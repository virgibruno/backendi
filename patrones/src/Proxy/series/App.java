package Proxy.series;

import Proxy.series.clases.ISerie;
import Proxy.series.clases.SerieNoHabilitadaException;
import Proxy.series.clases.SerieProxy;

public class App {

    public static void main(String[] args) {

        ISerie sp = new SerieProxy();

        try {
            System.out.println(sp.getLink("drhouse"));
            System.out.println(sp.getLink("drhouse"));
            System.out.println(sp.getLink("dexter"));
            System.out.println(sp.getLink("dexter"));
            System.out.println(sp.getLink("drhouse"));
        }
        catch (SerieNoHabilitadaException e) {
            System.err.println(e.toString());
        }
    }
}
