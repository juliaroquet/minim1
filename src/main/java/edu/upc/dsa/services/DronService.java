package edu.upc.dsa.services;
import edu.upc.dsa.models.dron;

import java.util.List;

public interface DronService {

    void añadirDron(String identificador, String nombre, String fabricante, String modelo);
    List<dron> listarDrones();
    void guardarDronEnAlmacen(String identificadorDron);
    void repararDronEnAlmacen();

}