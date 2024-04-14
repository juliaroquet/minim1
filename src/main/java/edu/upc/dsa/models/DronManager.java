package edu.upc.dsa.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DronManager {
    private static DronManager instance;
    private List<dron> drones = new ArrayList<>();


    private DronManager() {}

    // Método estático para obtener la instancia única de DronManager
    public static DronManager getInstance() {
        if (instance == null) {
            instance = new DronManager();
        }
        return instance;
    }


    public void agregarDron(String identificador, String nombre, String fabricante, String modelo) {
        dron nuevoDron = new dron(identificador, nombre, fabricante, modelo);
        drones.add(nuevoDron);
    }

    public List<dron> listarDrones() {
        List<dron> dronesOrdenados = new ArrayList<>(drones);
        dronesOrdenados.sort(Comparator.comparing(dron::getHorasVuelo).reversed());
        return dronesOrdenados;
    }
}
