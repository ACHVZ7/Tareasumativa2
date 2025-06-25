package main;

import modelos.Empleado;
import modelos.Gerente;

public class Main {
    public static void main(String[] args) {
        Empleado lucia = new Empleado("Lucía Martínez", "001-250789-0032L", 5, 950);
        System.out.println(lucia + " \n ");

        Gerente maria = new Gerente("María López", "003-320689-0067L", 10, 1800);
        System.out.println(maria);
        System.out.println(maria.getBono()+ " \n ");

        Empleado carlos = new Empleado("Carlos Gómez", "002-140578-0091G", 3, 1200);
        System.out.println(carlos + " \n ");

        Empleado javier = new Empleado("Javier Morales", "004-210799-0053M", 1, 750);
        System.out.println(javier + " \n ");

        Empleado fernanda = new Empleado("Fernanda Ruiz", "005-110595-0088R", 7, 1450);
        System.out.println(fernanda + " \n ");

        Gerente ernesto = new Gerente("Ernesto Castillo", "006-090888-0021C", 15, 2200);
        System.out.println(ernesto);
        System.out.println(ernesto.getBono()+ " \n ");











    }
}
