package Proxy.series.clases;

public interface ISerie {
    String getLink(String nombre) throws SerieNoHabilitadaException;
}
