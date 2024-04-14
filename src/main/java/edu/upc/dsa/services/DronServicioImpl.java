// DronServiceImpl.java
package edu.upc.dsa.services;

import edu.upc.dsa.models.Dron;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DronServiceImpl implements DronService {

    @Override
    public void añadirDron(String identificador, String nombre, String fabricante, String modelo) {
        DronManager.getInstance().agregarDron(identificador, nombre, fabricante, modelo);
    }

    @Override
    public List<Dron> listarDronesOrdenadosPorHorasDeVuelo() {
        return DronManager.getInstance().listarDronesOrdenadosPorHorasDeVuelo();
    }

    @Override
    public void guardarDronEnAlmacen(String identificadorDron) {
        AlmacenManager.getInstance().guardarDronEnAlmacen(identificadorDron);
    }

    @Override
    public void repararDronEnAlmacen() {
        AlmacenManager.getInstance().repararDronEnAlmacen();
    }
}
