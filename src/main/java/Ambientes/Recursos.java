package Ambientes;

public class Recursos {
    private int agua;
    private int luz;
    private int nutrientes;

    public Recursos(int agua, int luz, int nutrientes) {
        this.agua = agua;
        this.luz = luz;
        this.nutrientes = nutrientes;
    }

    // Metodos getters y setters
    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getLuz() {
        return luz;
    }

    public void setLuz(int luz) {
        this.luz = luz;
    }

    public int getNutrientes() {
        return nutrientes;
    }

    public void setNutrientes(int nutrientes) {
        this.nutrientes = nutrientes;
    }

    public void incrementarAgua(int agua) {
        this.agua += agua;
    }

    public void decrementarAgua(int agua) {
        this.agua -= agua;
    }

    public void incrementarLuz(int luz) {
        this.luz += luz;
    }

    public void decrementarLuz(int luz) {
        this.luz -= luz;
    }

    public void incrementarNutrientes(int nutrientes) {
        this.nutrientes += nutrientes;
    }

    public void decrementarNutrientes(int nutrientes) {
        this.nutrientes -= nutrientes;
    }

    public void incrementarRecursos(int agua, int luz, int nutrientes) {
        this.agua += agua;
        this.luz += luz;
        this.nutrientes += nutrientes;
    }

    public void decrementarRecursos(int agua, int luz, int nutrientes) {
        this.agua -= agua;
        this.luz -= luz;
        this.nutrientes -= nutrientes;
    }

    public void incrementarRecursos(Recursos recursos) {
        this.agua += recursos.getAgua();
        this.luz += recursos.getLuz();
        this.nutrientes += recursos.getNutrientes();
    }

    public void decrementarRecursos(Recursos recursos) {
        this.agua -= recursos.getAgua();
        this.luz -= recursos.getLuz();
        this.nutrientes -= recursos.getNutrientes();
    }

    public void incrementarAgua() {
        this.agua++;
    }

    public void decrementarAgua() {
        this.agua--;
    }

    public void incrementarLuz() {
        this.luz++;
    }

    public void decrementarLuz() {
        this.luz--;
    }



}
