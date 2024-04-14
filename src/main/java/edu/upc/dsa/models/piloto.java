package edu.upc.dsa.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class piloto {
    String identificador;
    String nombre;
    String apellidos;
    double horasVuelo;

    public piloto(String identificador, String nombre, String apellidos) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.apellidos = apellidos;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }



    public static class PilotoManager {
        List<piloto> pilotos = new ArrayList<>();

        public void agregarPiloto(String identificador, String nombre, String apellidos) {
            piloto nuevoPiloto = new piloto(identificador, nombre, apellidos);
            pilotos.add(nuevoPiloto);
        }

        public List<piloto> listarPilotos() {
            List<piloto> pilotosOrdenados = new ArrayList<>(pilotos);
            pilotosOrdenados.sort(Comparator.comparing(piloto::getHorasVuelo).reversed());
            return pilotosOrdenados;
        }
    }}









