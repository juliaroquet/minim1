// Fachada.java
package edu.upc.dsa.services;

public class Fachada {
    private static Fachada instance;

    private DronService dronService;
    private PilotoService pilotoService;
    private ReservaService reservaService;
    private AlmacenService almacenService;

    private Fachada() {
        this.dronService = new DronServiceImpl();
        this.pilotoService = new PilotoServiceImpl();
        // Agrega aquí la inicialización de reservaService y almacenService si es necesario
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

    // Agrega aquí los métodos para obtener reservaService y almacenService si es necesario
}
