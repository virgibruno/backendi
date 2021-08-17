package logger;

import org.apache.log4j.Logger;

public class Test {
    private static final Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args){
        Calculadora c = new Calculadora(1,3);
        System.out.println(c.sumar());
        Calculadora c2 = new Calculadora(2,0);
        c2.dividir();
        Calculadora c3 = new Calculadora(2,3);
        c3.dividir();
    }

}
