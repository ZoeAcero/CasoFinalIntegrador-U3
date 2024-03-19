package Analisis_Avanzado.Resolucion_Problemas;
import java.util.List;
import Gestion_Usuarios_Simulaciones.Registro_Actividades.RegistroActividades;
import Gestion_Usuarios_Simulaciones.Registro_Actividades.SimulacionResultados;

public class ResolucionProblemas {
    private RegistroActividades registro;

    public ResolucionProblemas(RegistroActividades registro) {
        this.registro = registro;
    }

    public boolean buscarEquilibrioEcologico() {
        List<SimulacionResultados> resultados = registro.getResultados();
        for (SimulacionResultados resultado : resultados) {
            if (resultado.getSaludPromedio() < 0.5 || resultado.getTamañoPromedio() < 0.5) {
                return false;
            }
        }
        return false;
    }

    public void evaluarEstrategiasConservacion() {
        List<SimulacionResultados> resultados = registro.getResultados();
        for (SimulacionResultados resultado : resultados) {
            if (resultado.getTotalOrganismos() < 100) {
                System.out.println("La estrategia de conservación actual no es efectiva. Se necesita una nueva estrategia.");
                return;
            }
        }
        System.out.println("La estrategia de conservación actual es efectiva.");

    }
}
