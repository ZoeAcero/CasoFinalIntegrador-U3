package Gestion_Usuarios_Simulaciones;

public class SimulacionConfiguracion {
    private int tamañoPoblacion;
    private double tasaCrecimiento;
    private int numeroIteraciones;

    public SimulacionConfiguracion(int tamañoPoblacion, double tasaCrecimiento, int numeroIteraciones) {
        this.tamañoPoblacion = tamañoPoblacion;
        this.tasaCrecimiento = tasaCrecimiento;
        this.numeroIteraciones = numeroIteraciones;
    }

    // Getters and Setters

    public int getTamañoPoblacion() {
        return tamañoPoblacion;
    }

    public void setTamañoPoblacion(int tamañoPoblacion) {
        this.tamañoPoblacion = tamañoPoblacion;
    }

    public double getTasaCrecimiento() {
        return tasaCrecimiento;
    }

    public void setTasaCrecimiento(double tasaCrecimiento) {
        this.tasaCrecimiento = tasaCrecimiento;
    }

    public int getNumeroIteraciones() {
        return numeroIteraciones;
    }

    public void setNumeroIteraciones(int numeroIteraciones) {
        this.numeroIteraciones = numeroIteraciones;
    }

}
