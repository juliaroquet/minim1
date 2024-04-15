// DronServiceImpl.java
package edu.upc.dsa.services;

import edu.upc.dsa.models.Almacen;
import edu.upc.dsa.models.DronManager;
import edu.upc.dsa.models.dron;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DronServiceImpl implements DronService {


    private final ArrayList<dron> drones;

    public DronServiceImpl() {
        this.drones = new ArrayList<>();
    }


    final static Logger logger = Logger.getLogger(DronServiceImpl.class);

    @Override
    public void añadirDron(String identificador, String nombre, String fabricante, String modelo) {
        logger.info("añade dron: " + identificador + ", nombre: " + nombre + ", fabricante: " + fabricante + ", modelo: " + modelo);
        DronManager.getInstance().agregarDron(identificador, nombre, fabricante, modelo);
        logger.info("Dron");
    }

    @Override
    public void añadeDron(String identificador, String nombre, String fabricante, String modelo) {
        
    }

    @Override
    public List<dron> listarDronesOrdenadosPorHorasDeVuelo() {
        logger.info("lista");
        List<dron> drones = DronManager.getInstance().listarDrones();
        logger.info("lista correcta");
        return drones;
    }

    @Override
    public void guardarDronEnAlmacen(String identificadorDron, String nombre, String fabricante, String modelo) {
        logger.info("guarda dron: " + identificadorDron + ", nombre: " + nombre + ", fabricante: " + fabricante + ", modelo: " + modelo);
        Almacen almacen = Almacen.getInstance();
        dron dron = new dron(identificadorDron, nombre, fabricante, modelo);
        almacen.guardarDron(dron);
        logger.info("guardado.");
    }

    @Override
    public boolean deleteDron(String id) {
        Iterator<dron> iterator = this.drones.iterator();
        while (iterator.hasNext()) {
            dron dron = iterator.next();
            if (dron.getIdentificador().equals(id)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public void repararDronEnAlmacen() {
        logger.info("reparar");
        Almacen almacen = Almacen.getInstance();
        almacen.repararDron();
        logger.info("reparado");
    }
}
