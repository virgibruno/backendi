package logger2;

import org.apache.log4j.Logger;

public abstract class Animal {
    private static final Logger logger = Logger.getLogger(Main.class);
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        if(edad <0) {
            logger.error("la edad de " + this.nombre + "es menor a 0");
        }
    }

    public void correr(){
        logger.info(this.nombre + " está corriendo");
    }

    public abstract void esMayourA10();

    public static Logger getLogger() {
        return logger;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
