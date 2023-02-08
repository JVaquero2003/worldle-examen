package com.examen.worldle.service;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.examen.worldle.model.Palabra;
import com.examen.worldle.repository.PalabraRepository;

@Service
public abstract class AbstractPalabraService implements ServicePalabra {

    Logger l = org.apache.logging.log4j.LogManager.getLogger();

    @Autowired
    @Qualifier("listPalabra")
    public PalabraRepository repository;

    String PalabraCorrecta;

    int IntentosPosibles;

    @Override
    public String getPalabraCorrecta() {
        return this.PalabraCorrecta;
    }

    @Override
    public String comprobar(String palabra) {
        if (palabra.equals(this.PalabraCorrecta)) {
            return "Correcto";
        } else {
            return "Incorrecto";
        }
    }

    @Override
    public void getIntentos(int intentos) {
        repository.getIntentos(intentos);
    }

    @Override
    public void guardarIntentos(Palabra palabra) {
        repository.guardarIntentos(palabra);
    }

    @Override
    public List<Palabra> listaPalabras() {
        List<Palabra> listaPalabras = repository.listAllPalabra();

        return listaPalabras;
    }
}
