package Organismos;

public class Planta extends Organismo{
    private int cantidadHojas;
    private int cantidadFlores;
    private int cantidadFrutos;


    public Planta(int salud, int edad, boolean estadoReproductivo, int cantidadHojas, int cantidadFlores, int cantidadFrutos) {
        super(salud, edad, estadoReproductivo);
        this.cantidadHojas = cantidadHojas;
        this.cantidadFlores = cantidadFlores;
        this.cantidadFrutos = cantidadFrutos;
    }

    // Metodos getters y setters
    public int getCantidadHojas() {
        return cantidadHojas;
    }

    public void setCantidadHojas(int cantidadHojas) {
        this.cantidadHojas = cantidadHojas;
    }

    public int getCantidadFlores() {
        return cantidadFlores;
    }

    public void setCantidadFlores(int cantidadFlores) {
        this.cantidadFlores = cantidadFlores;
    }
}
