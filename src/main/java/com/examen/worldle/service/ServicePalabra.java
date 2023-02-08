package com.examen.worldle.service;

import java.util.List;

import com.examen.worldle.model.Palabra;

public interface ServicePalabra {

    String comprobar(String palabra);

    String getPalabraCorrecta();

    void getIntentos(int intentos);

    int guardar(Palabra palabra);

    List<Palabra> listaPalabras();
}
