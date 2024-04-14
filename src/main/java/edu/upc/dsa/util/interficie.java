package edu.upc.dsa.util;

import edu.upc.dsa.models.dron;

import java.util.List;

public interface interficie {

    String crearDron(String id, String nombre, String fabricante, String modelo);

    void addDrone(String id, String nombre, String fabricante, String modelo) throws DronAlreadyAssignedException;


    void addPilot(String id, String name, String lastname) throws PilotoAlreadyAssignedException;


    List<dron> getSortedDronesByFlightHours();


    List<piloto> getSortedPilotsByFlightHours();


    void guardardron(String dronId);



    <FlightPlanReservation> List<FlightPlanReservation> getFlightPlanReservationsForPilot(String pilotoId);


    <FlightPlanReservation> List<FlightPlanReservation> getFlightPlanReservationsForDrone(String dronId);

    class DronNotOperationalException extends Exception {
    }

    class PilotoAlreadyAssignedException extends Exception {
    }

    class DronYaExisteException extends Exception {
    }
}
