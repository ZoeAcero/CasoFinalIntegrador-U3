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
}
