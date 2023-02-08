package com.examen.worldle.repository;

import org.springframework.stereotype.Repository;

@Repository("listPalabra")
public class ListRepositoryPalabra implements PalabraRepository {

    @Override
    public void addPalabra(String palabra) {
        System.out.println(palabra);
    }
}
