package com.reyeda.reproductor.modelos;

public class MisFav {

    public void adicion(Audio audio){
        if (audio.getClasificacion() >= 10){
            System.out.println(audio.getTitulo() + " Es uno de tus favoritos del momento");
        }else if (audio.getClasificacion() >= 5){
            System.out.println(audio.getTitulo() + " Tambien es uno de los favoritos");
        }else{
            System.out.println(audio.getTitulo() + " No es muy escuchado");
        }
    }
}
