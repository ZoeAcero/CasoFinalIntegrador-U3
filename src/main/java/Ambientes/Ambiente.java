package Ambientes;

public class Ambiente {
    private int temperatura;
    private int humedad;
    private int cantidadLuz;
    private Terreno terreno;
    private Recursos recursos;
    private Clima clima;

   public Ambiente(int temperatura, int humedad, int cantidadLuz, Terreno terreno, Recursos recursos, Clima clima) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.cantidadLuz = cantidadLuz;
        this.terreno = terreno;
        this.recursos = recursos;
        this.clima = clima;
   }

    // Metodos getters y setters

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getHumedad() {
        return humedad;
    }

    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }


}
