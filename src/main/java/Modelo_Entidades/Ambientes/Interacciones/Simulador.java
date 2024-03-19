package Modelo_Entidades.Ambientes.Interacciones;

import Modelo_Entidades.Ambientes.Ambiente.Ambiente;
import Modelo_Entidades.Ambientes.Organismos.Organismo;

import java.util.List;



public class Simulador {
    private List<Organismo> organismos;
    private Ambiente ambiente;

    // Metodos para simular interacciones

    public void simularInteracciones() {
        for (Organismo organismo : organismos) {
            organismo.interactuar(ambiente);
        }
    }

}
