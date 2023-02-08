package com.examen.worldle.service;

import java.util.List;

import com.examen.worldle.model.Palabra;

public interface ServicePalabra {

    String comprobar(String palabra);

    String getPalabraCorrecta();

    String getIntentos(int intentos);

    void guardarIntentos(Palabra palabra);

    List<Palabra> listaPalabras();
}
