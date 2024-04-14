// PilotoService.java
package edu.upc.dsa.services;

import edu.upc.dsa.models.piloto;

import java.util.List;

public interface PilotoService {
    void añadirPiloto(String identificador, String nombre, String apellidos);
    List<piloto> listarPilotosOrdenadosPorHorasDeVuelo();

    List<piloto> listarPilotos();
}
