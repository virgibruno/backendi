package com.dh.serializacion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Dia implements Serializable {
    private String dia;
    private List<Perro> perros = new ArrayList<>();

    public Dia(String dia) {
        this.dia = dia;
    }

    public void agregarPerro(Perro p){
        perros.add(p);
    }

    @Override
    public String toString() {
        String mensaje = "El día " + this.dia + " debe pasear a los perros: \n";
        for(Perro p : perros)
            mensaje += p.toString();
        mensaje +="-------------------------------------------------------";
        return mensaje;
    }
}
