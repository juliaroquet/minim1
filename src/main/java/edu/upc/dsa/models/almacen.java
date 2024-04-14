package edu.upc.dsa.models;

import java.util.ArrayList;
import java.util.List;

public class almacen {
    List<dron> dronesAlmacenados;

    public almacen() {
        this.dronesAlmacenados = new ArrayList<>();
    }
    public void guardarDron(dron dron) {
        dronesAlmacenados.add(dron);
    }
    private int Posicion() {
        return dronesAlmacenados.size();

    }
    public List<dron> getDronesAlmacenados() {
        return dronesAlmacenados;


}}