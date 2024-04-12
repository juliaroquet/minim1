package edu.upc.dsa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ManagerTest {
    private Manager TracksManager;

    @Before
    public void setUp() {
        TracksManager = Manager.getInstance();
    }

    @Test
    public void testAddDron() {
        TracksManager.añadirDron("001", "Dron 1", "Fabricante 1", "Modelo 1");
        assertEquals(1, TracksManager.getDronList().size());
    }

    @Test
    public void testAddPiloto() {
        TracksManager.addPiloto("001", "XX", "XX");
        assertEquals(1, TracksManager.getPilotoList().size());
    }

    @Test
    public void testListDronesByFlightHours() {
        TracksManager.addDrone("001", "Dron 1", "Fabricante 1", "Modelo 1");
        TracksManager.addDrone("002", "Dron 2", "Fabricante 2", "Modelo 2");
        TracksManager.addDrone("003", "Dron 3", "Fabricante 3", "Modelo 3");

        Assert.assertEquals("003", TracksManager.listDronesByFlightHours().get(0).getId());
        Assert.assertEquals("002", TracksManager.listDronesByFlightHours().get(1).getId());
        Assert.assertEquals("001", TracksManager.listDronesByFlightHours().get(2).getId());

    }

    @Test
    public void testListPilotsByFlightHours() {
        TracksManager.addPilot("001", "XX", "XX");
        TracksManager.addPilot("002", "XXX", "XXX");
        TracksManager.addPilot("003", "XXXX", "XXXX");

        assertEquals("003", TracksManager.listPilotsByFlightHours().get(0).getId());
        assertEquals("002", TracksManager.listPilotsByFlightHours().get(1).getId());
        assertEquals("001", TracksManager.listPilotsByFlightHours().get(2).getId());
    }
}
