package Ej1_1;

public class Main {
    public static void main(String[] args) {
        Avion av1 = new Avion("modeloEj", "2310F23");
        Vuelo vuelo1 = new Vuelo("Argentina","México","32D");
        av1.setVuelo(vuelo1);
        System.out.println("El avión: "+av1.getNumeroSerie()+" tiene asignado el vuelo de ID: "+av1.getVuelo().getIdvuelo());
    }
}
