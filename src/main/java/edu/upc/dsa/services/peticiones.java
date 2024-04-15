package edu.upc.dsa.services;

import edu.upc.dsa.models.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Api(value = "/dron", description = "Endpoint to Drones Service")
@Path("/dron")
public class ServicioDrones {

    private DronService dronService;

    @POST
    @ApiOperation(value = "Agregar un dron", notes = "Añade un nuevo dron al sistema")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Dron añadido correctamente"),
            @ApiResponse(code = 500, message = "Error interno en el servidor")
    })
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addDron(dron dron) {
        this.dronService.addDron(dron);
        return Response.status(201).build();
    }

    @GET
    @ApiOperation(value = "Obtener todos los drones", notes = "Devuelve una lista de todos los drones")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Éxito"),
            @ApiResponse(code = 404, message = "No se encontraron drones")
    })
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllDrones() {
        List<dron> drones = this.dronService.getAllDrones();
        if (!drones.isEmpty()) {
            return Response.status(200).entity(drones).build();
        } else {
            return Response.status(404).build();
        }
    }

    // Pilotos

    private PilotoService pilotoService;

    public ServicioDrones() {
        this.pilotoService = new PilotoService() {
            @Override
            public void añadirPiloto(String identificador, String nombre, String apellidos) {

            }

            @Override
            public List<piloto> listarPilotosOrdenadosPorHorasDeVuelo() {
                return null;
            }

            @Override
            public List<piloto> listarPilotos() {
                return null;
            }
        };
    }

    @POST
    @ApiOperation(value = "Agregar un piloto", notes = "Añade un nuevo piloto al sistema")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Piloto añadido correctamente"),
            @ApiResponse(code = 500, message = "Error interno en el servidor")
    })
    @Path("/piloto/add")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addPiloto(piloto piloto) {
        this.pilotoService.addPiloto(piloto);
        return Response.status(201).build();
    }

    @GET
    @ApiOperation(value = "Obtener todos los pilotos", notes = "Devuelve una lista de todos los pilotos")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Éxito"),
            @ApiResponse(code = 404, message = "No se encontraron pilotos")
    })
    @Path("/piloto/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPilotos() {
        List<piloto> pilotos = this.pilotoService.getAllPilotos();
        if (!pilotos.isEmpty()) {
            return Response.status(200).entity(pilotos).build();
        } else {
            return Response.status(404).build();
        }
    }

    // Reservas

    private reserva reservaService;

    public void reserva() {
        this.reservaService = new reserva();
    }

    @POST
    @ApiOperation(value = "Agregar una reserva", notes = "Añade una nueva reserva al sistema")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Reserva añadida correctamente"),
            @ApiResponse(code = 500, message = "Error interno en el servidor")
    })
    @Path("/reserva/add")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addReserva(reserva reservaObj) {
        this.reservaService.addReserva(reservaObj);
        return Response.status(201).build();
    }

    @GET
    @ApiOperation(value = "Obtener todas las reservas", notes = "Devuelve una lista de todas las reservas")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Éxito"),
            @ApiResponse(code = 404, message = "No se encontraron reservas")
    })
    @Path("/reserva/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllReservas() {
        List<reserva> reservas = this.reservaService.getAllReservas();
        if (!reservas.isEmpty()) {
            return Response.status(200).entity(reservas).build();
        } else {
            return Response.status(404).build();
        }
    }
}
