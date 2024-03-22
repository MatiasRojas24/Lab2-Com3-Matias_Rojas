package Ej1_3;

public class Reserva {
    private int numeroReserva;
    private Vuelo vuelo;

    public Reserva() {
    }

    public Reserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void agregarVuelo(Vuelo vueloNuevo){
        this.vuelo = vueloNuevo;
  }
}
