import Analisis_Avanzado.*;
import Analisis_Avanzado.Resolucion_Problemas.ResolucionProblemas;
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

    private static void analisisAvanzadoMenu(Scanner scanner) {
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenú:");
            System.out.println("1. Ejecutar simulación");
            System.out.println("2. Visualizar resultados");
            System.out.println("3. Integrar nuevas funciones");
            System.out.println("4. Resolucion problemas");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de leer la opción

            switch (opcion) {
                case 1:
                    ejecutarSimulacion(scanner);
                    break;
                case 2:
                    // Verificar si se han ejecutado previamente la simulación
                    if (tasasReproduccion != null && tasasMortalidad != null) {
                        visualizarResultados(scanner, tasasReproduccion, tasasMortalidad);
                    } else {
                        System.out.println("Primero debes ejecutar la simulación.");
                    }
                    break;
                case 3:
                    integrarNuevasFunciones(scanner);
                    break;
                case 4:
                    new ResolucionProblemas(scanner);
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
        }
        scanner.close();
    }

    public static class ResolucionProblemas {
        public ResolucionProblemas ( Scanner scanner ) {
            System.out.println ( "\n--- Resolución de Problemas ---" );
            System.out.println ( "1. Buscar equilibrio ecológico" );
            System.out.println ( "2. Evaluar estrategias de conservación" );
            System.out.println ( "3. Calcular impacto de la actividad humana" );
            System.out.println ( "4. Analizar resiliencia del ecosistema" );
            System.out.println ( "5. Otros métodos de resolución de problemas" );
            System.out.print ( "Seleccione una opción: " );
            int opcion = scanner.nextInt ();
            scanner.nextLine (); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    buscarEquilibrioEcologico ();
                    break;
                case 2:
                    evaluarEstrategiasConservacion ();
                    break;
                case 3:
                    calcularImpactoHumanidad ();
                    break;
                case 4:
                    analizarResilienciaEcosistema ();
                    break;
                case 5:
                    // Otros métodos de resolución de problemas
                    break;
                default:
                    System.out.println ( "Opción no válida, intente de nuevo." );
                    break;
            }
        }
}
