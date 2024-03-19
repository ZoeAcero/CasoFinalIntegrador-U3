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

    public int getCantidadLuz() {
        return cantidadLuz;
    }

    public void setCantidadLuz(int cantidadLuz) {
        this.cantidadLuz = cantidadLuz;
    }

    public Terreno getTerreno() {
        return terreno;
    }

    public void setTerreno(Terreno terreno) {
        this.terreno = terreno;
    }

    public Recursos getRecursos() {
        return recursos;
    }

    public void setRecursos(Recursos recursos) {
        this.recursos = recursos;
    }

    public Clima getClima() {
        return clima;
    }

    public void setClima(Clima clima) {
        this.clima = clima;
    }

    public void incrementarTemperatura(int temperatura) {
        this.temperatura += temperatura;
    }

    public void decrementarTemperatura(int temperatura) {
        this.temperatura -= temperatura;
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

    public void incrementarTerreno(Terreno terreno) {
        this.terreno = terreno;
    }

    public void incrementarRecursos(Recursos recursos) {
        this.recursos = recursos;
    }

    public void incrementarClima(Clima clima) {
        this.clima = clima;
    }

    public void decrementarTerreno(Terreno terreno) {
        this.terreno = terreno;
    }

    public void decrementarRecursos(Recursos recursos) {
        this.recursos = recursos;
    }

    public void decrementarClima(Clima clima) {
        this.clima = clima;
    }

    public void incrementarTemperatura() {
        this.temperatura++;
    }

    public void decrementarTemperatura() {
        this.temperatura--;
    }

    public void incrementarHumedad() {
        this.humedad++;
    }

    public void decrementarHumedad() {
        this.humedad--;
    }

    public void incrementarCantidadLuz() {
        this.cantidadLuz++;
    }

    public void decrementarCantidadLuz() {
        this.cantidadLuz--;
    }

    public void incrementarTerreno(int cantidad) {
        this.terreno.incrementarCantidad(cantidad);
    }

    public void decrementarTerreno(int cantidad) {
        this.terreno.decrementarCantidad(cantidad);
    }




}
