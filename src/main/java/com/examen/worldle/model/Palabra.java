package com.examen.worldle.model;

public class Palabra {
    private String palabra;
    private int cantidad;

    public Palabra() {
    }

    public Palabra(String palabra, int cantidad) {
        this.palabra = palabra;
        this.cantidad = cantidad;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Palabra{" +
                "palabra='" + palabra + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
