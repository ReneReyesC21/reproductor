package com.reyeda.reproductor.modelos;

public class Podcast extends Audio{
    //variables
    private String autor;
    private String descripcion;

    //metodo
    @Override
    public int getClasificacion() {
        if (getTotalRep() >= 500){
            return 10;
        }else if (getTotalRep() >= 200){
            return 5;
        }else{
            return 2;
        }
    }

    //getter
    public String getAutor() {
        return autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    //setter
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
