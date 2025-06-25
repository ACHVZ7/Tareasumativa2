package modelos;

public class Trabajador {
    private String nombre;
    private String numeroDeCedula;
    private int tiempoEnLaEmpresa;
    private int salarioEnDolares;

    public Trabajador() {
    }

    public Trabajador(String nombre, String numeroDeCedula, int tiempoEnLaEmpresa, int salarioEnDolares) {
        this.nombre = nombre;
        this.numeroDeCedula = numeroDeCedula;
        this.tiempoEnLaEmpresa = tiempoEnLaEmpresa;
        this.salarioEnDolares = salarioEnDolares;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroDeCedula() {
        return numeroDeCedula;
    }

    public void setNumeroDeCedula(String numeroDeCedula) {
        this.numeroDeCedula = numeroDeCedula;
    }

    public int getTiempoEnLaEmpresa() {
        return tiempoEnLaEmpresa;
    }

    public void setTiempoEnLaEmpresa(int tiempoEnLaEmpresa) {
        this.tiempoEnLaEmpresa = tiempoEnLaEmpresa;
    }

    public int getSalarioEnDolares() {
        return salarioEnDolares;
    }

    public void setSalarioEnDolares(int salarioEnDolares) {
        this.salarioEnDolares = salarioEnDolares;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Trabajador{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", numeroDeCedula='").append(numeroDeCedula).append('\'');
        sb.append(", años En La Empresa= ").append(tiempoEnLaEmpresa);
        sb.append(", salario En Dolares=").append(salarioEnDolares);
        sb.append('}');
        return sb.toString();
    }
}
