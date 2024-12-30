package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatch.modelos.Titulo;


public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public void incluye(Titulo titulo) {
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(int tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }
}