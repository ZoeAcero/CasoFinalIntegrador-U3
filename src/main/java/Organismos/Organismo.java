package Organismos;

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
}
