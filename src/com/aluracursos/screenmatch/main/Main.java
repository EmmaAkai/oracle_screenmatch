package com.aluracursos.screenmatch.main;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2021);

        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidaEnElPlan(true);

        miPelicula.muestraFichaTecnica();

        miPelicula.evalua(9);
        miPelicula.evalua(7.9);
        miPelicula.evalua(6.8);

        //System.out.println(miPelicula.getTotalDeNotas());
        //System.out.println(miPelicula.calculaMedia());

        Pelicula otraPelicula = new Pelicula("Matrix",1999);

        otraPelicula.setDuracionEnMinutos(180);


        Serie casaDragon = new Serie("The House Of The Dragon", 2022);

        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);

        System.out.println(casaDragon.getDuracionEnMinutos());
        casaDragon.muestraFichaTecnica();

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);

        System.out.println("Tiempo necesario para ver tus titulos: " + calculadora.getTiempoTotal() + " minutos.");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(300);

        filtroRecomendacion.filtra(episodio);


        var peliculaDeEma = new Pelicula("El Señor de los Anillos",2001);
        peliculaDeEma.setDuracionEnMinutos(180);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeEma);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre());

        System.out.println(listaDePeliculas.toString());

        System.out.println("toString de la pelicula 0: " + listaDePeliculas.get(0).toString());



    }
}
