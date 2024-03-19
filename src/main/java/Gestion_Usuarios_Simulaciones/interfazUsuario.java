package Gestion_Usuarios_Simulaciones;
import javax.swing.*;

public class interfazUsuario {
    private SimulacionControl control;
    private SimulacionConfiguracion configuracion;

    public interfazUsuario() {
        this.control = new SimulacionControl();
        this.configuracion = new SimulacionConfiguracion();

        JFrame frame = new JFrame("Simulador de Dinámicas Poblacionales");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JButton botonIniciar = new JButton("Iniciar simulación");
        botonIniciar.addActionListener(e -> control.iniciarSimulacion());

        JButton botonPausar = new JButton("Pausar simulación");
        botonPausar.addActionListener(e -> control.pausarSimulacion());

        JButton botonDetener = new JButton("Detener simulación");
        botonDetener.addActionListener(e -> control.detenerSimulacion());

        JButton botonConfigurar = new JButton("Configurar simulación");
        botonConfigurar.addActionListener(e -> configuracion.configurarSimulacion());

        JPanel panel = new JPanel();
        panel.add(botonIniciar);
        panel.add(botonPausar);
        panel.add(botonDetener);
        panel.add(botonConfigurar);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new interfazUsuario();
    }

}
