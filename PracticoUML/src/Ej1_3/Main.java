package Ej1_3;

public class Main {
    public static void main(String[] args) {
        Reserva res1 = new Reserva(532);
        Vuelo v1 = new Vuelo("Paraguay","Argentina","53F");
        res1.agregarVuelo(v1);
        System.out.println("La reserva: "+res1.getNumeroReserva()+" reservó el vuelo: "+res1.getVuelo().getIdvuelo());
    }
}
