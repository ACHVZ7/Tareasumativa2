package modelos;

public class Moto extends Vehiculo {

    public Moto(String nombre, String capacidad, String potencia, String transmision, int numeroDeRuedas, int numeroDePuertas) {
        super(nombre, capacidad, potencia, transmision, numeroDeRuedas, numeroDePuertas);
    }

    private String llevaCasco = "si lleva casco";

    public String getLlevaCasco() {
        return llevaCasco;
    }
}
