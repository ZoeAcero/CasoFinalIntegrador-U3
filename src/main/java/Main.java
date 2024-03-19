import Analisis_Avanzado.*;
import Gestion_Usuarios_Simulaciones.*;
import Modelo_Entidades.Ambientes.*;
import Modelo_Entidades.Ambientes.Ambiente.Ambiente;
import Modelo_Entidades.Ambientes.Interacciones.Simulador;
import Simulador_Dinamicas_Poblacionales.*;
import java.util.Scanner;
import java.util.Random;
import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        Ambiente ambiente = new Ambiente ( "Tropical", "Selva", 1000, 50, 50 );
        Simulador simulador = new Simulador ( 3.0, 80.0 );

        boolean salir = false;

        while (!salir) {
            System.out.println ( "\n--- Menú Principal ---" );
            System.out.println ( "1. Modelado de Entidades" );
            System.out.println ( "2. Simulador de Dinámicas Poblacionales" );
            System.out.println ( "3. Gestión de Usuarios y Simulaciones" );
            System.out.println ( "4. Análisis Avanzado" );
            System.out.println ( "5. Salir" );
            System.out.print ( "Seleccione una opción: " );
            scanner.nextLine (); // Consumir el salto de línea
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    modeladoEntidadesMenu ( ambiente );
                    break;
                case 2:
                    simuladorPoblacionalMenu ( ambiente, simulador );
                    break;
                case 3:
                    gestionUsuariosSimulacionesMenu ();
                    break;
                case 4:
                    analisisAvanzadoMenu (  scanner );
                    break;
                case 5:
                    salir = true;
                    System.out.println ( "Saliendo del programa..." );
                    break;
                default:
                    System.out.println ( "Opción no válida, intente de nuevo." );
                    break;
            }
        }
    }
}
