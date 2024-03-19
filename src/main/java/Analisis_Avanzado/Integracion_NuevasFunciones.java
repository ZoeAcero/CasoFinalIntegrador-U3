package Analisis_Avanzado;

public class Integracion_NuevasFunciones {
    private InvestigadorModelo investigadorModelo;

    public void setInvestigadorModelo(InvestigadorModelo investigadorModelo) {
        this.investigadorModelo = investigadorModelo;
    }

    public void adaptarSimulador() {
        if (investigadorModelo != null) {
            investigadorModelo.ejecutarModelo();
            investigadorModelo.definirFunciones();
        }
    }
}
