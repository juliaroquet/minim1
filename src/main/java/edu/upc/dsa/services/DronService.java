package edu.upc.dsa.services;

import edu.upc.dsa.models.dron;
import edu.upc.dsa.models.reserva;

import java.util.List;

public interface DronService {
    void añadirDron(String identificador, String nombre, String fabricante, String modelo);
    void addReserva(reserva reserva);

    void añadeDron(String identificador, String nombre, String fabricante, String modelo);
    List<dron> listarDronesOrdenadosPorHorasDeVuelo();

    void repararDronEnAlmacen();
    boolean deleteDron(String id);
    void guardarDronEnAlmacen(String identificadorDron, String nombre, String fabricante, String modelo);
    public default List<dron> getAllDrones() {
        return this.getAllDrones();
    }



}
