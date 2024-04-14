package edu.upc.dsa.models;

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
    }}







