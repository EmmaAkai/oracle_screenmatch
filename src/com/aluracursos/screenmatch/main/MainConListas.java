package com.aluracursos.screenmatch.main;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.*;

public class MainConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Matrix",1999);
        otraPelicula.evalua(6);
        var peliculaDeEma = new Pelicula("El Señor de los Anillos",2001);
        peliculaDeEma.evalua(10);

        Serie casaDragon = new Serie("The House Of The Dragon", 2022);
        casaDragon.evalua(10);


        List<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeEma);
        lista.add(casaDragon);


        for (Titulo item: lista){
            System.out.println(item);
            if (item instanceof Pelicula pelicula && pelicula.getCalificacion() > 3){
                System.out.println(pelicula.getCalificacion());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Jhonny Deep");
        listaDeArtistas.add("Jennifer Aniston");
        listaDeArtistas.add("Henry Cavill");
        System.out.println(listaDeArtistas);


        Collections.sort(listaDeArtistas);
        System.out.println("Lista de Artistas ordenada -> " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenada alfabeticamente -> " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista de titulos ordenada por lanzamiento ->" + lista);
    }
}
