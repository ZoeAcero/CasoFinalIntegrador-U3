package Simulador_Dinamicas_Poblacionales.Eventos_Aleatorios;
import Modelo_Entidades.Ambientes.Organismos.Organismo;
import Simulador_Dinamicas_Poblacionales.Eventos_Aleatorios.Eventos_Aleatorios;

import java.util.List;
import java.util.Random;

public class DesastreNatural extends Eventos_Aleatorios {
    @Override
    public void eventoAleatorio(List<Organismo> organismos) {
        Random random = new Random();
        for (Organismo organismo : organismos) {
            int saludPerdida = random.nextInt(20); // Perdida de salud entre 0 y 20
            organismo.decrementarSalud(saludPerdida);
        }
    }


}
