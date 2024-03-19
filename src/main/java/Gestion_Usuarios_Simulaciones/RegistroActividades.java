package Gestion_Usuarios_Simulaciones;
import java.util.List;
import java.util.ArrayList;

public class RegistroActividades {
    private List<SimulacionConfiguracion> configuraciones;
    private List<SimulacionResultados> resultados;

    public RegistroActividades() {
        this.configuraciones = new ArrayList<>();
        this.resultados = new ArrayList<>();
    }

    public void agregarConfiguracion(SimulacionConfiguracion configuracion) {
        this.configuraciones.add(configuracion);
    }

    public void agregarResultados(SimulacionResultados resultados) {
        this.resultados.add(resultados);
    }

    // Getters
    public List<SimulacionConfiguracion> getConfiguraciones() {
        return configuraciones;
    }

    public List<SimulacionResultados> getResultados() {
        return resultados;
    }
    
}
