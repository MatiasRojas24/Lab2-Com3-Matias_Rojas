package Ej1_4y1_5;

public class Main {
    public static void main(String[] args) {
        Piloto piloto1 = new Piloto("Carlos Gutierrez","35396605",31,"4324DF","Aerolineas Argentinas");
        System.out.println("Datos del piloto 1:");
        System.out.println("Nombre: "+piloto1.getNombre());
        System.out.println("DNI: "+piloto1.getDni());
        System.out.println("Edad: "+piloto1.getEdad());
        System.out.println("ID de avión: "+piloto1.getIdAvion());
        System.out.println("Empresa: "+piloto1.getEmpresa());
        System.out.println();
        piloto1.volar();
    }
}
