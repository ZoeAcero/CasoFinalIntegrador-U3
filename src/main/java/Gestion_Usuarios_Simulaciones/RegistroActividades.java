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
}
