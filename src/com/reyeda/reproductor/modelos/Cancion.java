package com.reyeda.reproductor.modelos;

public class Cancion extends Audio {
    //variables
    private String album;
    private String cantante;
    private String genero;

    //metodo
    @Override
    public int getClasificacion() {
        if (getTotalMeGusta() >= 5000){
            return 10;
        }else if (getTotalMeGusta() >= 2000){
            return 5;
        }else{
            return 2;
        }
    }

    //getter
    public String getAlbum() {
        return album;
    }

    public String getCantante() {
        return cantante;
    }

    public String getGenero() {
        return genero;
    }

    //setter
    public void setAlbum(String album) {
        this.album = album;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


}
