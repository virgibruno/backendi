package com.dh.serializacion;

import java.io.Serializable;

public class Perro implements Serializable {
    private String nombre;
    private String raza;
    private Integer edad;
    private String direccion;

    public Perro(String nombre, String raza, Integer edad, String direccion) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return " - " +nombre + " de raza " + raza + ", " + edad + " años. Buscar por: " + direccion +".\n";
    }
}
