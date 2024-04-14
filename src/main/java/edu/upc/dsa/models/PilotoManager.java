package edu.upc.dsa.models;
import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PilotoManager {
    private static final Logger logger = Logger.getLogger(PilotoManager.class);
    private static PilotoManager instance;
    private List<piloto> pilotos;

    private PilotoManager() {
        pilotos = new ArrayList<>();
    }

    public static PilotoManager getInstance() {
        if (instance == null) {
            instance = new PilotoManager();
            logger.info("instancia creada");
        }
        return instance;
    }

    public void agregarPiloto(String identificador, String nombre, String apellidos) {
        piloto nuevoPiloto = new piloto(identificador, nombre, apellidos);
        pilotos.add(nuevoPiloto);
        logger.info("piloto agregado: " + nuevoPiloto.toString());
    }

    public List<piloto> listarPilotos() {
        List<piloto> pilotosOrdenados = new ArrayList<>(pilotos);
        pilotosOrdenados.sort(Comparator.comparing(piloto::getHorasVuelo).reversed());
        logger.info("lista correcta");
        return pilotosOrdenados;
    }
}
