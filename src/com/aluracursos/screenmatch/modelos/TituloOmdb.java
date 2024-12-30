package com.aluracursos.screenmatch.modelos;
//para poder reconocer cualquier API utilizo DTO(Data Transfer object)
//permite una clase intermediaria que permite comprender el Json y transferirla al objeto

public record TituloOmdb(String title, String year, String runtime) {


}
