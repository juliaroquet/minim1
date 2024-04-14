package edu.upc.dsa.services;

import edu.upc.dsa.models.dron;

import java.util.List;

public interface DronService {
    void añadirDron(String identificador, String nombre, String fabricante, String modelo);
    List<dron> listarDronesOrdenadosPorHorasDeVuelo();

    void repararDronEnAlmacen();
    void guardarDronEnAlmacen(String identificadorDron, String nombre, String fabricante, String modelo);


}
