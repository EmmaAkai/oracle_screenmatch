package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Calificacion;

public class Episodio implements Calificacion {
    private int numero;
    private String nombre;
    private Serie serie;
    private int totalVisualizaciones;


    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getTotalVisualizaciones() {
        return totalVisualizaciones;
    }

    public void setTotalVisualizaciones(int totalVisualizaciones) {
        this.totalVisualizaciones = totalVisualizaciones;
    }

    @Override
    public int getCalificacion() {
        if (totalVisualizaciones > 100) {
            return 4;
        }else {
            return 2;
        }
    }
}
