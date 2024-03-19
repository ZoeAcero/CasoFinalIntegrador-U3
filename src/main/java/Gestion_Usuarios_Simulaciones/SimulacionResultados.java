package Gestion_Usuarios_Simulaciones;

public class SimulacionResultados {
    private double saludPromedio;
    private double tamañoPromedio;
    private int totalOrganismos;

    public SimulacionResultados(double saludPromedio, double tamañoPromedio, int totalOrganismos) {
        this.saludPromedio = saludPromedio;
        this.tamañoPromedio = tamañoPromedio;
        this.totalOrganismos = totalOrganismos;
    }

    // Getters and Setters
    public double getSaludPromedio() {
        return saludPromedio;
    }

    public void setSaludPromedio(double saludPromedio) {
        this.saludPromedio = saludPromedio;
    }
}
