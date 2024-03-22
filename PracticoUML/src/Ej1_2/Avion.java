package Ej1_2;

    public class Avion {
        private String modelo;
        private String numeroSerie;
        private Flota flota;
        public Avion() {
        }
        public Avion(String modelo, String numeroSerie, String nombreFlota) {
            this.modelo = modelo;
            this.numeroSerie = numeroSerie;
            this.flota = new Flota(nombreFlota);
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

        public Flota getFlota() {
            return flota;
        }

        public void setFlota(Flota flota) {
            this.flota = flota;
        }
    }

