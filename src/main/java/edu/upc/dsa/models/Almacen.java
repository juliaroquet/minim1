// Almacen.java
package edu.upc.dsa.models;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private static Almacen instance;
    private List<Object> dronesAlmacenados;

    private Almacen() {
        this.dronesAlmacenados = new ArrayList<Object>();
    }

    public static Almacen getInstance() {
        if (instance == null) {
            instance = new Almacen();
        }
        return instance;
    }

    public void guardarDron(Object dron) {
        dronesAlmacenados.add(dron);
    }

    public Object repararDron() {
        if (!dronesAlmacenados.isEmpty()) {
            Object dronReparado = dronesAlmacenados.get(0);
            dronesAlmacenados.remove(0);
            return dronReparado;
        } else {
            return null;
        }
    }
}


