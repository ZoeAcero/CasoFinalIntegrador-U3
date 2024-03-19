package Modelo_Entidades.Ambientes.Interacciones;

import Modelo_Entidades.Ambientes.Ambiente.Ambiente;
import Modelo_Entidades.Ambientes.Organismos.Organismo;

import java.util.List;



public class Simulador {
    private List<Organismo> organismos;
    private Ambiente ambiente;

    // Metodos para simular interacciones

    public void agregarOrganismo(Organismo organismo) {
        this.organismos.add(organismo);
    }

    public void simularInteracciones() {
        for (Organismo organismo : organismos) {
            organismo.interactuar(ambiente);
        }
    }

    public void setOrganismos(List<Organismo> organismos) {
        this.organismos = organismos;
    }

    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }

    public List<Organismo> getOrganismos() {
        return organismos;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }


}
