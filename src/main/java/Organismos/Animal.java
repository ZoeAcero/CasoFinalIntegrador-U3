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

    // Metodos getters y setters
    public int getCantidadPatas() {
        return cantidadPatas;
    }

    public void setCantidadPatas(int cantidadPatas) {
        this.cantidadPatas = cantidadPatas;
    }

    public int getCantidadOjos() {
        return cantidadOjos;
    }

    public void setCantidadOjos(int cantidadOjos) {
        this.cantidadOjos = cantidadOjos;
    }

    public int getCantidadDientes() {
        return cantidadDientes;
    }

    public void setCantidadDientes(int cantidadDientes) {
        this.cantidadDientes = cantidadDientes;
    }
}
