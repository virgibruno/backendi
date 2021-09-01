package model;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Avion {
    private int id;
    private String marca;
    private String matricula;
    private Calendar fechaEntradaServicio;

    public Avion(String marca, String matricula, int anio, int mes, int dia) {
        this.marca = marca;
        this.matricula = matricula;
        this.fechaEntradaServicio = new GregorianCalendar(anio, mes, dia);
    }

    public Avion(String marca, String matricula, Date date) {
        this.marca = marca;
        this.matricula = matricula;
        this.fechaEntradaServicio = new GregorianCalendar();
        fechaEntradaServicio.setTime(date);
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

    public Calendar getFechaEntradaServicio() {
        return fechaEntradaServicio;
    }

    public void setFechaEntradaServicio(Calendar fechaEntradaServicio) {
        this.fechaEntradaServicio = fechaEntradaServicio;
    }

    public String getFechaEnString(){
        return (fechaEntradaServicio.get(Calendar.YEAR) + "-"+ fechaEntradaServicio.get(Calendar.MONTH)+ "-" + fechaEntradaServicio.get(Calendar.DAY_OF_MONTH));
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nMarca: " + marca + "\nMatricula: "+ matricula + "\nFecha de entrada en servicio: " + this.getFechaEnString() +"\n";
    }
}
