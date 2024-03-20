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
                    ejecutarSimulacion ( scanner );
                    break;
                case 2:
                    // Verificar si se han ejecutado previamente la simulación
                    if (tasasReproduccion != null && tasasMortalidad != null) {
                        visualizarResultados ( scanner, tasasReproduccion, tasasMortalidad );
                    } else {
                        System.out.println ( "Primero debes ejecutar la simulación." );
                    }
                    break;
                case 3:
                    integrarNuevasFunciones ( scanner );
                    break;
                case 5:
                    resolucionproblemas ( scanner);
                    break;
                case 4:
                    salir = true;
                    System.out.println ( "Saliendo del programa." );
                    break;
                default:
                    System.out.println ( "Opción inválida. Por favor, ingrese una opción válida." );
            }
        }

    }

    private static double[] tasasReproduccion;
    private static double[] tasasMortalidad;

    public static void ejecutarSimulacion ( Scanner scanner ) {
        System.out.println ( "Ejecutando simulación..." );

        // Solicitar al usuario datos de entrada específicos para la simulación
        System.out.print ( "Ingrese el número de especies en la simulación: " );
        int numEspecies = scanner.nextInt ();
        scanner.nextLine (); // Consumir la nueva línea después de leer el número de especies

        // Inicializar los arrays para almacenar las tasas de reproducción y mortalidad
        tasasReproduccion = new double[numEspecies];
        tasasMortalidad = new double[numEspecies];

        // Solicitar al usuario las características de cada especie
        for (int i = 0; i < numEspecies; i++) {
            System.out.println ( "Especie " + (i + 1) + ":" );
            System.out.print ( "  Tasa de reproducción: " );
            tasasReproduccion[i] = scanner.nextDouble ();
            scanner.nextLine (); // Consumir la nueva línea después de leer la tasa de reproducción
            System.out.print ( "  Tasa de mortalidad: " );
            tasasMortalidad[i] = scanner.nextDouble ();
            scanner.nextLine (); // Consumir la nueva línea después de leer la tasa de mortalidad
        }




