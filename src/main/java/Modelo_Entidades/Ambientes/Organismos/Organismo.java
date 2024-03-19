package Modelo_Entidades.Ambientes.Organismos;

import Modelo_Entidades.Ambientes.Ambiente.Ambiente;

public class Organismo { // Clase padre de todos los organismos
    private int salud;
    private int edad;
    private boolean estadoReproductivo;


    public Organismo(int salud, int edad, boolean estadoReproductivo) {
        this.salud = salud;
        this.edad = edad;
        this.estadoReproductivo = estadoReproductivo;
    }

    // Metodos getters y setters
public boolean isEstadoReproductivo() {
        return estadoReproductivo;
    }

    public void setEstadoReproductivo(boolean estadoReproductivo) {
        this.estadoReproductivo = estadoReproductivo;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void incrementarSalud(int salud) {
        this.salud += salud;
    }

    public void decrementarSalud(int salud) {
        this.salud -= salud;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void interactuar(Ambiente ambiente) {

        int temperatura = ambiente.getTemperatura();

        // Si la temperatura es demasiado baja o demasiado alta, el organismo pierde salud
        if (temperatura < 10 || temperatura > 40) {
            decrementarSalud(10);
        }

        // Si los recursos son escasos, el organismo pierde salud
        if (ambiente.getRecursos().getCantidadAgua() < 10 || ambiente.getRecursos().getCantidadComida() < 10) {
            decrementarSalud(10);
        }
    }


}
