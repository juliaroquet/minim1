package edu.upc.dsa;

import edu.upc.dsa.models.dron;
import edu.upc.dsa.models.piloto;

import java.util.*;

public class Manager<Reserva> {
    private List<dron> listaDrones;
    private List<piloto> listaPilotos;
    private List<Reserva> listaReservas;

    public Manager() {
        this.listaDrones = new ArrayList<>();
        this.listaPilotos = new ArrayList<>();
        this.listaReservas = new ArrayList<>();
    }

    public static Manager getInstance() {
        return null;
    }


    public void addDron(String id, String nombre, String fabricante, String modelo) {
        dron nuevoDron = new dron(id, nombre, fabricante, modelo);
        listaDrones.add(nuevoDron);
    }


    public void añadirPiloto(String id, String name, String lastname) {
        piloto nuevoPiloto = new piloto(id, name, lastname);
        listaPilotos.add(nuevoPiloto);
    }


    public List<dron> listarDronesPorHorasDeVuelo() {

        Collections.sort(listaDrones, Comparator.comparingInt(dron::getHorasDeVuelo).reversed());
        return listaDrones;
    }


    public List<Piloto> listarPilotosPorHorasDeVuelo() {

        Collections.sort(listaPilotos, Comparator.comparingInt(Piloto::getHorasDeVuelo).reversed());
        return listaPilotos;
    }


    public void guardarDronParaMantenimiento(String idDron) {
        dron dron = null;
        for (dron d : listaDrones) {
            if (d.getId().equals(idDron)) {
                dron = d;
                break;
            }
        }


        if (dron != null) {
            listaDrones.remove(dron);

            almacenMantenimiento.add(dron);

        }
    }



    public void repararDronEnAlmacen() {

    }


    public void añadirReserva(String idDron, Date fecha, int estimacionHoras, Posicion inicio, Posicion destino, piloto piloto) {

    }


    public List<Reserva> ReservasDePiloto(piloto piloto) {

        return null;
    }


    public List<Reserva> ReservasDeDron(dron dron) {

        return null;
    }



}
