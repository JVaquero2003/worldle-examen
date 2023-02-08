package com.examen.worldle.model;

public class Palabra {

    public String palabra;
    public int intentos;

    public Palabra() {
    }

    public Palabra(String palabra) {
        super();
        this.palabra = palabra;
    }

    public Palabra(String palabra, int intentos) {
        super();
        this.palabra = palabra;
        this.intentos = intentos;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public String toString() {
        return "Palabra{" +
                "palabra='" + palabra;
    }
}
