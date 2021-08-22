package model;

import java.util.Date;

public class Avion {
    private int id;
    private String marca;
    private String matricula;
    private Date fechaEntradaServicio;

    public Avion(String marca, String matricula, Date fechaEntradaServicio) {
        this.marca = marca;
        this.matricula = matricula;
        this.fechaEntradaServicio = fechaEntradaServicio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getFechaEntradaServicio() {
        return fechaEntradaServicio;
    }

    public void setFechaEntradaServicio(Date fechaEntradaServicio) {
        this.fechaEntradaServicio = fechaEntradaServicio;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nMarca: " + marca + "\nMatricula: "+ matricula + "\nFecha de entrada en servicio: " + fechaEntradaServicio +"\n";
    }
}
