package modelos;

public class Avion extends Vehiculo{
    public Avion(String nombre, String capacidad, String potencia, String transmision, int numeroDeRuedas, int numeroDePuertas) {
        super(nombre, capacidad, potencia, transmision, numeroDeRuedas, numeroDePuertas);
    }
 private String destino = "Miami ";

    public String getDestino() {
        return destino;
    }
}
