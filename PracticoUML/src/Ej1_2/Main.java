package Ej1_2;


public class Main {
    public static void main(String[] args) {
        Avion av1 = new Avion("modeloEj","38213C41","Aerolineas Arg");
        System.out.println("El avión: "+av1.getNumeroSerie()+" Pertenece a la flota: "+av1.getFlota().getNombreFlota());

    }
}
