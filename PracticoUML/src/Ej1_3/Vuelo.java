package Ej1_3;

public class Vuelo {
    private String origen;
    private String destino;
    private String idvuelo;


    public Vuelo() {
    }

    public Vuelo(String origen, String destino, String idvuelo) {
        this.origen = origen;
        this.destino = destino;
        this.idvuelo = idvuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getIdvuelo() {
        return idvuelo;
    }

    public void setIdvuelo(String idvuelo) {
        this.idvuelo = idvuelo;
    }
}