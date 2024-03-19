package Simulador_Dinamicas_Poblacionales.Crecimiento_Reproduccion;
import Modelo_Entidades.Ambientes.Interacciones.Simulador;
import Modelo_Entidades.Ambientes.Organismos.Organismo;
import Simulador_Dinamicas_Poblacionales.Eventos_Aleatorios.Eventos_Aleatorios;

import java.util.List;
import java.util.Random;

public class Creciemiento_Reproduccion {
    private Simulador simulador;

    public Creciemiento_Reproduccion(Simulador simulador) {
        this.simulador = simulador;
    }

    public void crecer(Organismo organismo) {
        organismo.incrementarSalud(10);
        organismo.setEdad(organismo.getEdad() + 1);
    }

    public void reproducir(Organismo organismo) {
        if (organismo.isEstadoReproductivo()) {
            Organismo nuevoOrganismo = new Organismo(organismo.getSalud(), 0, true);
            simulador.agregarOrganismo(nuevoOrganismo);
        }
    }

    public static class Enfermedad extends Eventos_Aleatorios {
        @Override
        public void eventoAleatorio(List<Organismo> organismos) {
            Random random = new Random();
            for (Organismo organismo : organismos) {
                int saludPerdida = random.nextInt(20); // Perdida de salud entre 0 y 20
                organismo.decrementarSalud(saludPerdida);
            }
        }
    }
}
