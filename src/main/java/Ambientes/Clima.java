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

    public int getHumedad() {
        return humedad;
    }

    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }

    public int getCantidadLuz() {
        return cantidadLuz;
    }

    public void setCantidadLuz(int cantidadLuz) {
        this.cantidadLuz = cantidadLuz;
    }

    public void incrementarTemperatura(int tempertaura) {
        this.tempertaura += tempertaura;
    }

    public void decrementarTemperatura(int tempertaura) {
        this.tempertaura -= tempertaura;
    }

    public void incrementarHumedad(int humedad) {
        this.humedad += humedad;
    }

    public void decrementarHumedad(int humedad) {
        this.humedad -= humedad;
    }

    public void incrementarCantidadLuz(int cantidadLuz) {
        this.cantidadLuz += cantidadLuz;
    }

    public void decrementarCantidadLuz(int cantidadLuz) {
        this.cantidadLuz -= cantidadLuz;
    }

}
