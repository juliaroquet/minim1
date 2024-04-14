// DronServiceImpl.java
package edu.upc.dsa.services;
import edu.upc.dsa.models.DronManager;
import edu.upc.dsa.models.Almacen;
import edu.upc.dsa.models.dron;
import java.util.List;

public class DronServiceImpl implements DronService {

    @Override
    public void añadirDron(String identificador, String nombre, String fabricante, String modelo) {
        DronManager.getInstance().agregarDron(identificador, nombre, fabricante, modelo);
    }

    @Override
    public List<dron> listarDronesOrdenadosPorHorasDeVuelo() {
        return DronManager.getInstance().listarDrones();
    }


    @Override
    public void guardarDronEnAlmacen(String identificadorDron, String nombre, String fabricante, String modelo) {
        Almacen almacen = Almacen.getInstance();
        dron dron = new dron(identificadorDron, nombre, fabricante, modelo);
        almacen.guardarDron(dron);
    }

    @Override
    public void repararDronEnAlmacen() {
        Almacen almacen = Almacen.getInstance();
        almacen.repararDron();
    }
    }

