package com.examen.worldle.service;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.examen.worldle.repository.PalabraRepository;

@Profile("easy")
@Service
public class ServicePalabraEasy extends AbstractPalabraService {

    Logger l = org.apache.logging.log4j.LogManager.getLogger();

    @Autowired
    @Qualifier("listPalabra")
    public PalabraRepository repository;

    public ServicePalabraEasy() {
        PalabraCorrecta = "hola";
    }

}
