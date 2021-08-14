package Proxy.series.clases;

public class SerieNoHabilitadaException extends Exception{
    @Override
    public String toString() {
        return "Excede la cantidad de reproducciones permitidas";
    }
}
