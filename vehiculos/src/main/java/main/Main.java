package main;

import modelos.Avion;
import modelos.Carro;
import modelos.Moto;

public class Main {
    public static void main(String[] args) {
        Carro nissan = new Carro("Nissan", "400 kg ", "1000 hp", "Mecanica", 4, 4);
        System.out.println(nissan);
        System.out.println("capacidad de pasajeros= " + nissan.getPasajeros() + " \n ");

        Moto kawasaki = new Moto("Ninja 650", "649 cc", "68 HP" , "Manual", 2, 0);
        System.out.println(kawasaki);
        System.out.println("El motociclista " + kawasaki.getLlevaCasco() + " \n ");

        Avion cessna = new Avion("Cessna 172 Skyhawk", "1,200 kg", "180 HP", "Manual, control de palanca", 3, 2);
        System.out.println(cessna);
        System.out.println("El avion se dirige a " + cessna.getDestino() + " \n ");


    }
}
