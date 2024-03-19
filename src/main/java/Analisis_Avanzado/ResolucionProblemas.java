package Analisis_Avanzado;
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
            if (resultado.getSaludPromedio() < 0.5 && resultado.getTamañoPromedio() < 0.5) {
                return false;
            }
        }
        return false;
    }

    
}
