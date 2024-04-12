package edu.upc.dsa;

import java.util.ArrayList;
import java.util.List;

import edu.upc.dsa.models.dron;
import org.apache.log4j.Logger;

public class Manager implements TracksManager {


    final static Logger logger = Logger.getLogger(Manager.class);
    private final List<dron> drones;
    private final List<piloto> pilotos;

    private Manager() {
        drones = new ArrayList<>();
        pilotos = new ArrayList <>();
    }

    public static Manager getInstance() {
        if (instance==null) {
            instance = new Manager();
        }
        return instance;
    }

    public List<piloto> addDrone(String id, String nombre, String fabricante, String modelo) {
        LOGGER.info("Nuevo dron: ID=" + id + ", Nombre=" + nombre + ", Fabricante=" + fabricante + ", Modelo=" + modelo);
        dron newDron = new dron(id, nombre, fabricante, modelo);
        drones.add(newDron);




        public void addPilot(String id, String name, String lastName){
            LOGGER.info("Añadiendo nuevo piloto: ID=" + id + ", Nombre=" + name + ", Apellidos=" + lastName);
            Pilot newPilot = new Pilot(id, name, lastName);
            pilots.add(newPilot);


            public List<dron> listDronesByFlightHours () {

                LOGGER.info("drones ordenados");
                Collections.sort(drones, Collections.reverseOrder(Comparator.comparing(Drone::getFlightHours)));
                return drones;


                public List<Pilot> listPilotsByFlightHours () {
                    LOGGER.info("pilotos por horas de vuelo");
                    Collections.sort(pilots, Collections.reverseOrder(Comparator.comparing(Pilot::getFlightHours)));
                    return pilotos;

                }
            }


        }}};