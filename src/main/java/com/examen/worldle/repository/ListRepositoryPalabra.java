package com.examen.worldle.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.examen.worldle.model.Palabra;

@Repository("listPalabra")
public class ListRepositoryPalabra implements PalabraRepository {

    static List<Palabra> list = new ArrayList<>();

    @Override
    public String getPalabraCorrecta() {
        return "hola";
    }

    @Override
    public String comprobar(String palabra) {
        if (palabra.equals("hola")) {
            return "Correcto";
        } else {
            return "Incorrecto";
        }
    }

    // metodo que devuelve el numero de intentos pero como maximo 3 sino me devuelve
    // has superado el numero de intentos cogiendo los dartos de la lista
    @Override
    public void getIntentos(int intentos) {
        if (intentos >= 3) {
            intentos = 3;
        }
        intentos++;
    }

    @Override
    public void guardarIntentos(Palabra palabra) {
        list.add(palabra);
    }

    @Override
    public List<Palabra> listAllPalabra() {
        List<Palabra> lista = list;

        return lista;
    }
}
