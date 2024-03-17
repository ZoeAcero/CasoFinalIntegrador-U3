package Organismos;

public class Organismo {
    private Posicion posicion;
    private int salud;
    private int edad;
    private boolean estadoReproductivo;


    public Organismo(Posicion posicion, int salud, int edad, boolean estadoReproductivo) {
        this.posicion = posicion;
        this.salud = salud;
        this.edad = edad;
        this.estadoReproductivo = estadoReproductivo;
    }

    // Metodos getters y setters
    public Posicion getPosicion() {
        return posicion;
    }
    
}
