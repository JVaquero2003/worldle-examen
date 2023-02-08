package com.examen.worldle.repository;

import java.util.List;

import com.examen.worldle.model.Palabra;

public interface PalabraRepository {

    String getPalabraCorrecta();

    String comprobar(String palabra);

    void getIntentos(int intentos);

    void guardarIntentos(Palabra palabra);

    List<Palabra> listAllPalabra();
}
