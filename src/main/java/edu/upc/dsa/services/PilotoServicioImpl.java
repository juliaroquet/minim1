package edu.upc.dsa.services;

import edu.upc.dsa.models.PilotoManager;
import edu.upc.dsa.models.piloto;
import org.apache.log4j.Logger;

import java.util.Comparator;
import java.util.List;

public class PilotoServicioImpl implements PilotoService {

    final static Logger logger = Logger.getLogger(PilotoServicioImpl.class);

    @Override
    public void añadirPiloto(String identificador, String nombre, String apellidos) {
        logger.info(" añade piloto: " + identificador + ", nombre: " + nombre + ", apellidos: " + apellidos);
        PilotoManager.getInstance().agregarPiloto(identificador, nombre, apellidos);
        logger.info("Piloto añadido");
    }

    @Override
    public List<piloto> listarPilotosOrdenadosPorHorasDeVuelo() {
        logger.info("lista");
        List<piloto> pilotos = PilotoManager.getInstance().listarPilotos();
        pilotos.sort(Comparator.comparing(piloto::getHorasVuelo).reversed());
        logger.info("lista correcta.");
        return pilotos;
    }

    @Override
    public List<piloto> listarPilotos() {
        logger.info(" lista");
        List<piloto> pilotos = PilotoManager.getInstance().listarPilotos();
        logger.info("lista correcta.");
        return pilotos;
    }
}
