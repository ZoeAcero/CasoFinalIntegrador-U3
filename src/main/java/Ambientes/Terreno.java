package Ambientes;

public class Terreno {

    private String tipo;
    private int cantidad;
    private int nutrientes;

    public Terreno(String tipo, int cantidad, int nutrientes) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.nutrientes = nutrientes;
    }

    // Metodos getters y setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getNutrientes() {
        return nutrientes;
    }

    public void setNutrientes(int nutrientes) {
        this.nutrientes = nutrientes;
    }

    public void incrementarNutrientes(int nutrientes) {
        this.nutrientes += nutrientes;
    }



