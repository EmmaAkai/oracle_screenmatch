package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.excepcion.ErrorEnConversionDeDuracionException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidaEnElPlan;
    private double totalDeNotas;
    private int cantDeNotas = 0;

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public Titulo(TituloOmdb miTituloOmdb) {
        this.nombre = miTituloOmdb.title();
        //Lo transforma en Int
        this.fechaDeLanzamiento = Integer.valueOf(miTituloOmdb.year());
        //Lo transforma en Int y toma los valores del 0 al 3 y al " "(espacio) lo remplazo por "" (nada)
        if (miTituloOmdb.runtime().contains("N/A")){
            throw new ErrorEnConversionDeDuracionException("No pude convertir la duracion por que continene un N/A");
        }
        this.duracionEnMinutos = Integer.valueOf(
                miTituloOmdb.runtime().substring(0,3).replace(" ", ""));
    }

    public int getCantDeNotas() {
        return cantDeNotas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidaEnElPlan(boolean incluidaEnElPlan) {
        this.incluidaEnElPlan = incluidaEnElPlan;
    }

    public void setCantDeNotas(int cantDeNotas) {
        this.cantDeNotas = cantDeNotas;
    }

    public double getTotalDeNotas() {
        return totalDeNotas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidaEnElPlan() {
        return incluidaEnElPlan;
    }

    public void muestraFichaTecnica() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Duracion: " + getDuracionEnMinutos() + " minutos." );
        System.out.println("Fecha de lanzamiento: " + this.fechaDeLanzamiento);
    }

    public void evalua(double nota) {
        totalDeNotas += nota;
        cantDeNotas++;
    }

    public double calculaMedia(){
        return totalDeNotas/cantDeNotas;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return " (Nombre=' " + nombre +
                ", FechaDeLanzamiento= " + fechaDeLanzamiento +
                ", Duracion = " + duracionEnMinutos + ") ";
    }
}
