package Analisis_Avanzado.Visualizacion_Datos;

import Gestion_Usuarios_Simulaciones.Registro_Actividades.RegistroActividades;
import Gestion_Usuarios_Simulaciones.Registro_Actividades.SimulacionResultados;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.util.List;

public class VisualizacionDatos {
    private RegistroActividades registro;

    public VisualizacionDatos(RegistroActividades registro) {
        this.registro = registro;
    }

    public void mostrarDatosSimulacion() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        List<SimulacionResultados> resultados = registro.getSimulaciones();
        for (SimulacionResultados resultado : resultados) {
            dataset.addValue(resultado.getSaludPromedio(), "Salud Promedio", resultado.getNombreSimulacion());
            dataset.addValue(resultado.getTamañoPromedio(), "Tamaño Promedio", resultado.getNombreSimulacion());
        }

        // Crear el grafico
        JFreeChart chart = ChartFactory.createLineChart("Resultados de Simulaciones", "Simulaciones", "Valor", dataset);

        // Mostrar el grafico
        ChartPanel chartPanel = new ChartPanel(chart);
        JFrame frame = new JFrame();
        frame.setContentPane(chartPanel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
