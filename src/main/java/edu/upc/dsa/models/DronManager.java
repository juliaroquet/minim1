package edu.upc.dsa.models;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DronManager {
    private static final Logger logger = Logger.getLogger(Almacen.class);
    private static DronManager instance;
    private List<dron> drones = new ArrayList<>();


    private DronManager() {}


    public static DronManager getInstance() {
        if (instance == null) {
            instance = new DronManager();
        }
        logger.info("instancia creada");
        return instance;
    }


    public void agregarDron(String identificador, String nombre, String fabricante, String modelo) {
        dron nuevoDron = new dron(identificador, nombre, fabricante, modelo);
        drones.add(nuevoDron);
        logger.info("dron agregado: " + nuevoDron.toString());

    }

    public List<dron> listarDrones() {
        List<dron> dronesOrdenados = new ArrayList<>(drones);
        dronesOrdenados.sort(Comparator.comparing(dron::getHorasVuelo).reversed());
        logger.info("lista hecha");
        return dronesOrdenados;
    }
}
