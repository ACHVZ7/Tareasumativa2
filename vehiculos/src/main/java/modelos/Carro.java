package modelos;

public class Carro extends Vehiculo{

    public Carro(String nombre, String capacidad, String potencia, String transmision, int numeroDeRuedas, int numeroDePuertas) {
        super(nombre, capacidad, potencia, transmision, numeroDeRuedas, numeroDePuertas);
    }
    private int pasajeros = 4;

    public int getPasajeros() {
        return pasajeros;
    }


}





