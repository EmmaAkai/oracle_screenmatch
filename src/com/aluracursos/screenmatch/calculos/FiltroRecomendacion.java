package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendacion {


    public void filtra(Calificacion clasificacion) {
        if (clasificacion.getCalificacion() >= 4){
            System.out.println("Muy bien evaluado!");
        } else if (clasificacion.getCalificacion() >= 2){
            System.out.println("Popular ahora mismo!");
        }else {
            System.out.println("Colocálo en tu lista para verlo después.");
        }
    }
}
