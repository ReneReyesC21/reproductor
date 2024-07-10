package com.reyeda.reproductor.modelos;

public class Audio {

private String titulo;
private int totalRep;
private int clasificacion;
private int totalMeGusta;

    //metodo
    public void meGusta(){
        this.totalMeGusta++;
    }
    public void reproduce(){
        this.totalRep++;
    }

    //getter
    public String getTitulo() {
        return titulo;
    }

    public int getTotalRep() {
        return totalRep;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public int getTotalMeGusta() {
        return totalMeGusta;
    }

    //setter
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTotalRep(int totalRep) {
        this.totalRep = totalRep;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setTotalMeGusta(int totalMeGusta) {
        this.totalMeGusta = totalMeGusta;
    }
}
