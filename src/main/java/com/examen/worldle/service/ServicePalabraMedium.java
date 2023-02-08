package com.examen.worldle.service;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.examen.worldle.repository.PalabraRepository;

@Profile("medium")
@Service
public class ServicePalabraMedium extends AbstractPalabraService {

    Logger l = org.apache.logging.log4j.LogManager.getLogger();

    @Autowired
    @Qualifier("listPalabra")
    public PalabraRepository repository;

    public ServicePalabraMedium() {
        PalabraCorrecta = "adios";

        IntentosPosibles = 10;
    }

}