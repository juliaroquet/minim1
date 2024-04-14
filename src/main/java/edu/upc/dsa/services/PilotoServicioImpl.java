package edu.upc.dsa.services;
import edu.upc.dsa.models.PilotoManager;
import edu.upc.dsa.models.piloto;
import java.util.Comparator;
import java.util.List;

public class PilotoServicioImpl implements PilotoService {

    @Override
    public void añadirPiloto(String identificador, String nombre, String apellidos) {
        PilotoManager.getInstance().agregarPiloto(identificador, nombre, apellidos);
    }

    @Override
    public List<piloto> listarPilotosOrdenadosPorHorasDeVuelo() {
        List<piloto> pilotos = PilotoManager.getInstance().listarPilotos();


        pilotos.sort(Comparator.comparing(piloto::getHorasVuelo).reversed());

        return pilotos;
    }


    @Override
    public List<piloto> listarPilotos() {
        return PilotoManager.getInstance().listarPilotos();
    }
}
