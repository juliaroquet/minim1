package edu.upc.dsa;

import edu.upc.dsa.models.*;
import edu.upc.dsa.services.DronService;
import edu.upc.dsa.services.DronServiceImpl;
import org.junit.*;
import edu.upc.dsa.models.Almacen;
import edu.upc.dsa.models.dron;
import edu.upc.dsa.models.piloto;
import edu.upc.dsa.models.reserva;

import java.util.List;

import static org.junit.Assert.*;

public class Tests {
    private DronService dronService;
    private Almacen almacen;
    private dron dron;

    @BeforeClass
    public static void setUpClass() {

    }

    @Before
    public void setUp() {
        pilotoManager = PilotoManager.getInstance();
        dronService = new DronServiceImpl();
        almacen = Almacen.getInstance();
    }

    @Test
    public void testGuardarDronEnAlmacen() {
        String identificadorDron = "1";
        String nombre = "Dron";
        String fabricante = "Fabricante";
        String modelo = "Modelo";
        dronService.guardarDronEnAlmacen(identificadorDron, nombre, fabricante, modelo);
        assertTrue(Almacen.getInstance().containsDron(identificadorDron));
    }

    @Test
    public void testRepararDronEnAlmacen() {
        String identificadorDron = "1";
        String nombre = "Dron";
        String fabricante = "Fabricante";
        String modelo = "Modelo";
        dronService.guardarDronEnAlmacen(identificadorDron, nombre, fabricante, modelo);
        dronService.repararDronEnAlmacen();
        assertFalse(Almacen.getInstance().containsDron(identificadorDron));
    }

    @Test
    public void testAgregarReserva() {
        piloto piloto = new piloto("1", "Nombre", "Apellido");
        String fecha = "2024-04-16";
        double duracion = 5;
        String inicio = "inicio";
        String destino = "destino";

        String identificadorDron = "1";
        String nombre = "Dron";
        String fabricante = "Fabricante";
        String modelo = "Modelo";
        dronService.guardarDronEnAlmacen(identificadorDron, nombre, fabricante, modelo);
        dron dron = new dron("1", "NombreDron", "FabricanteDron", "ModeloDron");
        reserva reserva = new reserva(dron, fecha, duracion, inicio, destino, piloto);
        almacen.agregarReserva(reserva);

        List<reserva> reservasPorPiloto = almacen.obtenerReservasPorPiloto(piloto.getIdentificador());
        assertTrue(reservasPorPiloto.contains(reserva));

        List<reserva> reservasPorDron = almacen.obtenerReservasPorDron(identificadorDron);
        assertTrue(reservasPorDron.contains(reserva));
    }

    @Test
    public void testListarDronesOrdenadosPorHorasDeVuelo() {

        DronService dronService = new DronServiceImpl();
        dronService.añadirDron("1", "Dron", "Fabricante", "Modelo");

        List<dron> dronesOrdenados = dronService.listarDronesOrdenadosPorHorasDeVuelo();

    }





    @After
    public void tearDown() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    private PilotoManager pilotoManager;

    @Test
    public void testAgregarPiloto() {
        pilotoManager.agregarPiloto("1", "xx", "xxx");
        List<piloto> pilotos = pilotoManager.listarPilotos();
        assertNotNull(pilotos);
        assertEquals(1, pilotos.size());
    }

    @Test
    public void testListarPilotos() {
        pilotoManager.agregarPiloto("1", "xx", "xxx");
        pilotoManager.agregarPiloto("2", "xxxx", "xxxx");
        List<piloto> pilotos = pilotoManager.listarPilotos();
        assertNotNull(pilotos);
        assertEquals(2, pilotos.size());
    }
    @Test
    public void testListarPilotosOrdenados() {

        pilotoManager.agregarPiloto("123", "xx", "xxxx");



        List<piloto> pilotos = pilotoManager.listarPilotos();
        for (piloto piloto : pilotos) {

            piloto.setHorasVuelo(4);
        }


        List<piloto> pilotosOrdenados = pilotoManager.listarPilotos();


        for (int i = 1; i < pilotosOrdenados.size(); i++) {
            double horasVueloAnterior = pilotosOrdenados.get(i - 1).getHorasVuelo();
            double horasVueloActual = pilotosOrdenados.get(i).getHorasVuelo();
            assertTrue(horasVueloAnterior >= horasVueloActual);
        }
    }
}

