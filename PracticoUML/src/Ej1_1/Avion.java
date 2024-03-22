package Ej1_1;

public class Avion {
    private String modelo;
    private String numeroSerie;
    private Vuelo vuelo;

    public Avion() {
    }
    public Avion(String modelo, String numeroSerie) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
}
