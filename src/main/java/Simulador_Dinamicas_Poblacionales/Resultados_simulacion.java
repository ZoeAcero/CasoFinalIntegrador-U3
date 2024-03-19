package Simulador_Dinamicas_Poblacionales;
import Modelo_Entidades.Ambientes.Organismos.Organismo;
import java.util.List;

public class Resultados_simulacion {
    private List<Organismo> organismos;

    public Resultados_simulacion(List<Organismo> organismos) {
        this.organismos = organismos;
    }

    public double calcularSaludPromedio() {
        int totalSalud = 0;
        for (Organismo organismo : organismos) {
            totalSalud += organismo.getSalud();
        }
        return (double) totalSalud / organismos.size();
    }

    public double calcularTamañoPromedio() {
        int totalTamaño = 0;
        for (Organismo organismo : organismos) {
            totalTamaño += organismo.getTamaño();
        }
        return (double) totalTamaño / organismos.size();
    }
}
