package edu.upc.dsa.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class dron {
     String identificador;
     String nombre;
     String fabricante;
     String modelo;
     double horasVuelo;

    public dron(String identificador, String nombre, String fabricante, String modelo) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.horasVuelo = 0;
    }



    public double getHorasVuelo() {
        return horasVuelo;
    }

    public void setHorasVuelo(double horasVuelo) {
        this.horasVuelo = horasVuelo;
    }
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
}

public static class DronManager {
    List<dron> drones = new ArrayList<dron>();

    public void agregarDron(String identificador, String nombre, String fabricante, String modelo) {
        dron nuevodron = new dron(identificador, nombre, fabricante, modelo);
        drones.add(nuevodron);
    }

    public List<dron> listarDrones() {
        List<dron> dronesOrdenados = new ArrayList<>(drones);
        dronesOrdenados.sort(Comparator.comparing(dron::getHorasVuelo).reversed());
        return dronesOrdenados;
    }
}}








