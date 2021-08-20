package listaDeEnteros;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    // atributos
    private List<Integer> listaEnteros;
    private Logger logger;

    // constructor
    public Lista() {
        listaEnteros = new ArrayList<>();
        logger = Logger.getLogger(App.class);
    }

    // metodos
    public void agregarNumero(Integer n) throws Exception {
        listaEnteros.add(n);
        if(this.listaEnteros.size() == 5) {
            logger.info("La lista tiene ahora 5 elementos");
        }
        if(this.listaEnteros.size() == 10) {
            logger.info("La lista tiene ahora 10 elementos");
        }
        calcularPromedio();
    }

    public void calcularPromedio() throws Exception{
        if(this.listaEnteros.size() == 0) {
            logger.error("La lista es igual a cero");
        } else {
            Integer sum = 0;
            for(Integer n : listaEnteros){
                sum += n;
            }
            logger.info("Promedio: " + sum/listaEnteros.size());
        }
    }

    public void buscarMinimo(){
        if(this.listaEnteros.size() == 0) {
            logger.error("La lista es igual a cero");
        } else {
            Integer min = null;
            for(Integer n : listaEnteros){
                if (min == null)
                    min = n;
                else if(n < min)
                    min = n;
            }
            logger.info("Minimo: " + min);
        }
    }

    public void buscarMaximo(){
        if(this.listaEnteros.size() == 0) {
            logger.error("La lista es igual a cero");
        } else {
            Integer max = 0;
            for(Integer n : listaEnteros){
                if(n > max)
                    max = n;
            }
            logger.info("Maximo: " + max);
        }
    }
}
