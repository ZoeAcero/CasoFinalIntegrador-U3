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

    public int getCantidadFrutos() {
        return cantidadFrutos;
    }

    public void setCantidadFrutos(int cantidadFrutos) {
        this.cantidadFrutos = cantidadFrutos;
    }

    public void incrementarHojas(int cantidadHojas) {
        this.cantidadHojas += cantidadHojas;
    }

    public void decrementarHojas(int cantidadHojas) {
        this.cantidadHojas -= cantidadHojas;
    }

    public void incrementarFlores(int cantidadFlores) {
        this.cantidadFlores += cantidadFlores;
    }

    public void decrementarFlores(int cantidadFlores) {
        this.cantidadFlores -= cantidadFlores;
    }

    //Metodo override
    @Override
    public void incrementarSalud(int salud) {
        super.incrementarSalud(salud);
        if (this.getSalud() > 100) {
            this.setSalud(100);
        }
    }

}
