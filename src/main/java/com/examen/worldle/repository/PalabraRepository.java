package com.examen.worldle.repository;

import java.util.List;

import com.examen.worldle.model.Palabra;

public interface PalabraRepository {

    String getPalabraCorrecta();

    String comprobar(String palabra);

    String getIntentos(int intentos);

    void guardarIntentos(int intentos);

    List<Palabra> listAllPalabra();
}
