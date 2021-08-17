package logger;

import org.apache.log4j.Logger;

public class Calculadora {
    private static final Logger logger = Logger.getLogger(Test.class);
    private int valor1;
    private int valor2;

    public Calculadora(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public int sumar(){
        return valor1+valor2;
    }

    public int restar(){
        return valor1-valor2;
    }

    public int multiplicar(){
        return valor1*valor2;
    }

    public double dividir(){
        logger.info("empezamos la division: " + valor1 + " / " + valor2);
        double rdo;
        try {
            rdo = valor1 / valor2;
        } catch (Exception e) {
            logger.error("OCURRIO UN ERROR AL INTENTAR DIVIDIR: ", e);
            return 0;
        }
        logger.debug("Terminamos de dividir");
        return rdo;
    }
}
