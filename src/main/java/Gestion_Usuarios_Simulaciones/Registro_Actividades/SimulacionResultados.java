package Gestion_Usuarios_Simulaciones.Registro_Actividades;

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

    public double getTamañoPromedio() {
        return tamañoPromedio;
    }

    public void setTamañoPromedio(double tamañoPromedio) {
        this.tamañoPromedio = tamañoPromedio;
    }

    public int getTotalOrganismos() {
        return totalOrganismos;
    }

    public void setTotalOrganismos(int totalOrganismos) {
        this.totalOrganismos = totalOrganismos;
    }

}
