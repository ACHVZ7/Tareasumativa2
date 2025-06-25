package modelos;

public class Gerente extends  Trabajador{
    public Gerente(String nombre, String numeroDeCedula, int tiempoEnLaEmpresa, int salarioEnDolares) {
        super(nombre, numeroDeCedula, tiempoEnLaEmpresa, salarioEnDolares);
    }

    private String bono = "200 dolares";

    public String getBono() {
        return getNombre() + " obtiene un bono de " + bono ;
    }

}
