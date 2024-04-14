package edu.upc.dsa.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PilotoManager {
    private static PilotoManager instance;
    private List<piloto> pilotos;

    private PilotoManager() {
        pilotos = new ArrayList<>();
    }

    public static PilotoManager getInstance() {
        if (instance == null) {
            instance = new PilotoManager();
        }
        return instance;
    }

    public void agregarPiloto(String identificador, String nombre, String apellidos) {
        piloto nuevoPiloto = new piloto(identificador, nombre, apellidos);
        pilotos.add(nuevoPiloto);
    }

    public List<piloto> listarPilotos() {
        List<piloto> pilotosOrdenados = new ArrayList<>(pilotos);
        pilotosOrdenados.sort(Comparator.comparing(piloto::getHorasVuelo).reversed());
        return pilotosOrdenados;
    }
}
