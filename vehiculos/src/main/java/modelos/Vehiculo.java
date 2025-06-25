package modelos;

public class Vehiculo {
    private String nombre;
    private String capacidad;
    private String potencia;
    private String transmision;
    private int numeroDeRuedas;
    private int numeroDePuertas;

    public Vehiculo() {
    }

    public Vehiculo(String nombre, String capacidad, String potencia, String transmision, int numeroDeRuedas, int numeroDePuertas) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.potencia = potencia;
        this.transmision = transmision;
        this.numeroDeRuedas = numeroDeRuedas;
        this.numeroDePuertas = numeroDePuertas;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public int getNumeroDeRuedas() {
        return numeroDeRuedas;
    }

    public void setNumeroDeRuedas(int numeroDeRuedas) {
        this.numeroDeRuedas = numeroDeRuedas;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Vehiculo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", capacidad='").append(capacidad).append('\'');
        sb.append(", potencia='").append(potencia).append('\'');
        sb.append(", transmision='").append(transmision).append('\'');
        sb.append(", numeroDeRuedas=").append(numeroDeRuedas);
        sb.append(", numeroDePuertas=").append(numeroDePuertas);
        sb.append('}');

        return sb.toString();
    }
}
