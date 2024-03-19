package Simulador_Dinamicas_Poblacionales;
import Modelo_Entidades.Ambientes.Interacciones.Simulador;
import Modelo_Entidades.Ambientes.Organismos.Organismo;

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

}
