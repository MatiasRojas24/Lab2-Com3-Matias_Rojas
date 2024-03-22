package Ej1_4y1_5;

public class Piloto extends Persona implements Volador{
    private String idAvion;
    private String empresa;

    public Piloto(String idAvion, String empresa) {
        this.idAvion = idAvion;
        this.empresa = empresa;
    }

    public Piloto(String nombre, String dni, int edad, String idAvion, String empresa) {
        super(nombre, dni, edad);
        this.idAvion = idAvion;
        this.empresa = empresa;
    }

    public String getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(String idAvion) {
        this.idAvion = idAvion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public void volar() {
        System.out.println("El piloto vuela en su avión");
    }
}
