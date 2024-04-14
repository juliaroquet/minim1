package edu.upc.dsa.models;
import java.util.ArrayList;
import java.util.List;
public class reserva {

    dron dron;
    String fecha;
    double duracion;
    String Inicio;
    String Destino;
    piloto piloto;

    public reserva(dron dron, String fecha, double duracion, String Inicio, String Destino, piloto piloto) {
        this.dron = dron;
        this.fecha = fecha;
        this.duracion = duracion;
        this.Inicio = Inicio;
        this.Destino = Destino;
        this.piloto = piloto;
    }

    public dron getDron() {
        return dron;
    }

    public void setDron(dron dron) {
        this.dron = dron;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getInicio() {
        return Inicio;
    }

    public void setInicio(String Inicio) {
        this.Inicio = Inicio;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(piloto piloto) {
        this.piloto = piloto;
    }

    public static class ReservaManager {
        List<reserva> reservas;

        public ReservaManager() {
            this.reservas = new ArrayList<>();
        }

        public void agregarReserva(reserva reserva) {
            reservas.add(reserva);
        }

        public List<reserva> obtenerReservasPorPiloto(String identificadorPiloto) {

            List<reserva> reservasPorPiloto = new ArrayList<>();
            for (reserva reserva : reservas) {
                if (reserva.getPiloto().getIdentificador().equals(identificadorPiloto)) {
                    reservasPorPiloto.add(reserva);
                }
            }
            return reservasPorPiloto;

        }

        public List<reserva> obtenerReservasPorDron(String identificadorDron) {
            List<reserva> reservasPorDron = new ArrayList<>();
            for (reserva reserva : reservas) {
                if (reserva.getDron().getIdentificador().equals(identificadorDron)) {
                    reservasPorDron.add(reserva);
                }
            }
            return reservasPorDron;
        }
    }
}
