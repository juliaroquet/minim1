// Almacen.java
package edu.upc.dsa.models;
import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private static final Logger logger = Logger.getLogger(Almacen.class);
    private static Almacen instance;
    private List<Object> dronesAlmacenados;
    private List<reserva> reservas;

    private Almacen() {
        this.dronesAlmacenados = new ArrayList<Object>();
        this.reservas= new ArrayList<>();
    }

    public static Almacen getInstance() {
        if (instance == null) {
            instance = new Almacen();
        }
        logger.info("instancia creada");
        return instance;
    }

    public void guardarDron(Object dron) {
        dronesAlmacenados.add(dron);
        logger.info("dron guardado: " + dron.toString());
    }

    public Object repararDron() {
        if (!dronesAlmacenados.isEmpty()) {
            Object dronReparado = dronesAlmacenados.get(0);
            dronesAlmacenados.remove(0);
            logger.info("dron reparado: " + dronReparado.toString());
            return dronReparado;
        } else {
            logger.info("dron no reparado: ");
            return null;
        }
    }
    public void agregarReserva(reserva reserva)
    {
        reservas.add(reserva);
    }
    public boolean containsDron(String identificadorDron) {
        for (Object dron : dronesAlmacenados) {

            if (dron.getClass().equals(identificadorDron)) {
                return true;
            }
        }
        return false;
    }
    public List<reserva> obtenerReservasPorPiloto(String identificadorPiloto) {
        List<reserva> reservasPorPiloto = new ArrayList<>();
        for (reserva reserva : reservas) {
            if (reserva.getPiloto().getIdentificador().equals(identificadorPiloto)) {
                reservasPorPiloto.add(reserva);
            }
        }
        return reservasPorPiloto;
    }
    public List<reserva> obtenerReservasPorDron(String identificadorDron) {
        List<reserva> reservasPorDron = new ArrayList<>();
        for (reserva reserva : reservas) {
            if (reserva.getDron().getIdentificador().equals(identificadorDron)) {
                reservasPorDron.add(reserva);
            }
        }
        return reservasPorDron;
    }


}


