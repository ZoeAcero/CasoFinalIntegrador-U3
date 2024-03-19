package Simulador_Dinamicas_Poblacionales;
import Modelo_Entidades.Ambientes.Organismos.Organismo;
import java.util.List;

public class DesastreNatural extends Eventos_Aleatorios {
    @Override
    public void eventoAleatorio(List<Organismo> organismos) {
        for (Organismo organismo : organismos) {
            organismo.decrementarSalud(10);
        }
    }
}
