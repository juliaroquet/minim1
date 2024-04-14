package edu.upc.dsa.services;
import edu.upc.dsa.models.Almacen;
public class Fachada {
    private static Fachada instance;

    private DronService dronService;
    private PilotoService pilotoService;
    private Almacen almacen;

    private Fachada() {
        this.dronService = new DronServiceImpl();
        this.pilotoService = new PilotoServicioImpl();
        this.almacen = Almacen.getInstance();
    }

    public static Fachada getInstance() {
        if (instance == null) {
            instance = new Fachada();
        }
        return instance;
    }

    public DronService getDronService() {
        return dronService;
    }
    public PilotoService getPilotoService() {
        return pilotoService;
    }
    public Almacen getAlmacen() {
        return almacen;
    }
}

















