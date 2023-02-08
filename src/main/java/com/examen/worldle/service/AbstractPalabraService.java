package com.examen.worldle.service;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.examen.worldle.repository.PalabraRepository;

@Service
public abstract class AbstractPalabraService implements ServicePalabra {

    Logger l = org.apache.logging.log4j.LogManager.getLogger();

    @Autowired
    @Qualifier("listPalabra")
    public PalabraRepository repository;

    @Override
    public void addPalabra(String palabra) {
        l.info("addPalabra");
        repository.addPalabra(palabra);
    }
}
