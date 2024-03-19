package Ambientes;

public class Clima {
    private int tempertaura;
    private int humedad;
    private int cantidadLuz;

    public Clima(int tempertaura, int humedad, int cantidadLuz) {
        this.tempertaura = tempertaura;
        this.humedad = humedad;
        this.cantidadLuz = cantidadLuz;
    }

    // Metodos getters y setters
    public int getTempertaura() {
        return tempertaura;
    }

    public void setTempertaura(int tempertaura) {
        this.tempertaura = tempertaura;
    }
}
