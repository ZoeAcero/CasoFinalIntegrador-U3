package Organismos;

public class Animal extends Organismo{
    private int cantidadPatas;
    private int cantidadOjos;
    private int cantidadDientes;

    public Animal(int salud, int edad, boolean estadoReproductivo, int cantidadPatas, int cantidadOjos, int cantidadDientes) {
        super(salud, edad, estadoReproductivo);
        this.cantidadPatas = cantidadPatas;
        this.cantidadOjos = cantidadOjos;
        this.cantidadDientes = cantidadDientes;
    }
}
