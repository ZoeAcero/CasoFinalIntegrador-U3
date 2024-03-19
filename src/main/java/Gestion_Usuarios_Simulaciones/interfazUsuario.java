package Gestion_Usuarios_Simulaciones;
import javax.swing.*;

public class interfazUsuario {
    private SimulacionControl control;
    private SimulacionConfiguracion configuracion;

    public interfazUsuario() {
        this.control = new SimulacionControl();
        this.configuracion = new SimulacionConfiguracion();

        JFrame frame = new JFrame("Simulador de Dinámicas Poblacionales");
        
    }

}
