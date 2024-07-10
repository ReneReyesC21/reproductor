package com.reyeda.reproductor.principal;

import com.reyeda.reproductor.modelos.Cancion;
import com.reyeda.reproductor.modelos.MisFav;
import com.reyeda.reproductor.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Un viaje a madrid");
        miCancion.setCantante("Carlos Rivera");

        Podcast miPodcast = new Podcast();
        miPodcast.setTitulo("El dia de muertos");
        miPodcast.setAutor("Tres Opiniones Que nadie Pidio");
//me gusta y reproducciones
        for (int i = 0; i < 9100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 1000; i++) {
            miCancion.reproduce();
        }

        for (int i = 0; i < 1000; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 5000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Total de reproducciones: " + miCancion.getTotalRep());
        System.out.println("Total de Me Gusta: " + miCancion.getTotalMeGusta());

        MisFav favoritos = new MisFav();
        favoritos.adicion(miPodcast);
        favoritos.adicion(miCancion);
    }
}
