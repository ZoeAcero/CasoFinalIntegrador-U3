import Analisis_Avanzado.*;
import Analisis_Avanzado.Resolucion_Problemas.ResolucionProblemas;
import Gestion_Usuarios_Simulaciones.*;
import Modelo_Entidades.Ambientes.*;
import Modelo_Entidades.Ambientes.Ambiente.Ambiente;
import Modelo_Entidades.Ambientes.Interacciones.Simulador;
import Modelo_Entidades.Ambientes.Organismos.Animal;
import Modelo_Entidades.Ambientes.Organismos.Planta;
import Simulador_Dinamicas_Poblacionales.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

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

        System.out.println ( "Simulación ejecutada correctamente." );
    }

    public static void visualizarResultados ( Scanner scanner, double[] tasasReproduccion, double[] tasasMortalidad ) {
        System.out.println ( "Visualizando resultados de la simulación:" );

        // Crear un conjunto de datos para el gráfico
        DefaultCategoryDataset dataset = new DefaultCategoryDataset ();
        for (int i = 0; i < tasasReproduccion.length; i++) {
            dataset.addValue ( tasasReproduccion[i], "Tasa de reproducción", "Especie " + (i + 1) );
            dataset.addValue ( tasasMortalidad[i], "Tasa de mortalidad", "Especie " + (i + 1) );
        }

        // Crear el gráfico
        JFreeChart chart = ChartFactory.createBarChart (
                "Tasas de reproducción y mortalidad por especie",
                "Especies",
                "Tasa",
                dataset
        );

        // Mostrar el gráfico en un panel
        JFrame frame = new JFrame ( "Resultados de la simulación" );
        frame.setLayout ( new BorderLayout () );
        frame.setDefaultCloseOperation ( JFrame.DISPOSE_ON_CLOSE );
        ChartPanel chartPanel = new ChartPanel ( chart );
        frame.add ( chartPanel, BorderLayout.CENTER );
        frame.setSize ( 800, 600 );
        frame.setLocationRelativeTo ( null );
        frame.setVisible ( true );

        // Mostrar también las tasas de reproducción y mortalidad en la consola
        System.out.println ( "\nTasas de reproducción y mortalidad de las especies:" );
        for (int i = 0; i < tasasReproduccion.length; i++) {
            System.out.println ( "Especie " + (i + 1) + ":" );
            System.out.println ( "  Tasa de reproducción: " + tasasReproduccion[i] );
            System.out.println ( "  Tasa de mortalidad: " + tasasMortalidad[i] );
        }

        // Regresar al menú principal
        System.out.println ( "\nPresione Enter para volver al menú principal." );
        scanner.nextLine (); // Esperar a que el usuario presione Enter
    }

    public static void integrarNuevasFunciones ( Scanner scanner ) {
        System.out.println ( "Integrando nuevas funciones..." );

        // Ejemplo de cómo podrías permitir al usuario definir nuevas reglas de interacción entre especies
        System.out.println ( "¿Desea definir nuevas reglas de interacción entre especies? (s/n)" );
        String respuesta = scanner.next ();
        if (respuesta.equalsIgnoreCase ( "s" )) {
            System.out.println ( "Ingrese la nueva regla de interacción entre especies:" );
            String nuevaRegla = scanner.next ();
            System.out.println ( "Nueva regla integrada: " + nuevaRegla );
        }

        // Ejemplo de cómo podrías permitir al usuario configurar parámetros personalizados
        System.out.println ( "¿Desea configurar parámetros personalizados para la simulación? (s/n)" );
        respuesta = scanner.next ();
        if (respuesta.equalsIgnoreCase ( "s" )) {
            System.out.println ( "Ingrese el nombre del parámetro:" );
            String nombreParametro = scanner.next ();
            System.out.println ( "Ingrese el valor del parámetro:" );
            double valorParametro = scanner.nextDouble ();
            System.out.println ( "Parámetro configurado: " + nombreParametro + " = " + valorParametro );
        }

    }
    public static void resolucionproblemas ( Scanner scanner ){
        ResolucionProblemas problemas = new ResolucionProblemas ();

        boolean salir = false;
        while (!salir) {
            System.out.println("\nMenú de Resolución de Problemas:");
            System.out.println("1. Buscar equilibrio ecológico");
            System.out.println("2. Evaluar estrategias de conservación");
            System.out.println("3. Calcular impacto de la humanidad");
            System.out.println("4. Analizar resiliencia del ecosistema");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    problemas.buscarEquilibrioEcologico();
                    break;
                case 2:
                    problemas.evaluarEstrategiasConservacion();
                    break;
                case 3:
                    problemas.calcularImpactoHumanidad();
                    break;
                case 4:
                    problemas.analizarResilienciaEcosistema();
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
        }

    }

    static class ResolucionProblemas {
        public void buscarEquilibrioEcologico() {
            System.out.println("Calculando diversidad de especies y evaluando estabilidad del ecosistema...");
            // Aquí iría la lógica para calcular la diversidad de especies y evaluar la estabilidad del ecosistema
            // Por ejemplo, supongamos que estamos realizando un cálculo aleatorio para la diversidad
            Random random = new Random();
            double diversidad = random.nextDouble() * 100; // Supongamos que el valor de diversidad está en un rango de 0 a 100
            System.out.println("La diversidad del ecosistema es: " + diversidad);
        }

        public void evaluarEstrategiasConservacion() {
            // Implementación para evaluar estrategias de conservación
            // Por ejemplo, analizar el impacto de medidas de protección de especies en peligro
            System.out.println("Evaluar estrategias de conservación...");
        }

        public void calcularImpactoHumanidad() {
            // Implementación para calcular el impacto de la actividad humana en el ecosistema
            // Por ejemplo, evaluar el efecto de la deforestación o la contaminación en la biodiversidad
            System.out.println("Calcular impacto de la humanidad...");
        }

        public void analizarResilienciaEcosistema() {
            // Implementación para analizar la resiliencia del ecosistema ante perturbaciones
            // Por ejemplo, estudiar cómo se recupera el ecosistema después de un incendio forestal
            System.out.println("Analizar resiliencia del ecosistema...");
        }
    }

    public static void modeladoEntidadesMenu ( Ambiente ambiente ) {
        Scanner scanner = new Scanner ( System.in );
        boolean salir = false;

        while (!salir) {
            System.out.println ( "\n--- Modelado de Entidades ---" );
            System.out.println ( "1. Crear Planta" );
            System.out.println ( "2. Crear Animal" );
            System.out.println ( "3. Volver al Menú Principal" );
            System.out.print ( "Seleccione una opción: " );
            int opcion = scanner.nextInt ();
            scanner.nextLine (); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    // Lógica para crear una nueva planta
                    crearNuevaPlanta ( scanner );
                    break;
                case 2:
                    // Lógica para crear un nuevo animal
                    crearNuevoAnimal ( scanner );
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println ( "Opción no válida, intente de nuevo." );
                    break;
            }
        }
    }

    public static void crearNuevaPlanta ( Scanner scanner ) {
        System.out.println ( "Ingrese el nombre de la planta:" );
        String nombre = scanner.next ();

        System.out.println ( "Ingrese el tipo de la planta:" );
        String tipo = scanner.next ();

        System.out.println ( "Ingrese la altura de la planta:" );
        double altura = scanner.nextDouble ();

        System.out.println ( "Ingrese el estado de salud de la planta (bueno, regular, malo):" );
        String salud = scanner.next ();

        System.out.println ( "Ingrese el estado de reproducción de la planta (true/false):" );
        boolean estadoReproduccion = scanner.nextBoolean ();

        // Crear una nueva instancia de Planta con los datos proporcionados
         Planta nuevaPlanta = new Planta ( nombre, tipo, altura, salud, estadoReproduccion );

        // Aquí puedes hacer algo con la nueva planta, como agregarla a una lista de plantas en tu vivero, etc.
        System.out.println ( "¡Planta creada exitosamente!" );
    }


    public static void crearNuevoAnimal ( Scanner scanner ) {
        System.out.println ( "Ingrese el nombre del animal:" );
        String nombre = scanner.next ();

        System.out.println ( "Ingrese la especie del animal:" );
        String especie = scanner.next ();

        System.out.println ( "Ingrese la edad del animal:" );
        int edad = scanner.nextInt ();

        // Aquí puedes agregar más atributos según tu clase Animal
        System.out.println ( "Ingrese el género del animal:" );
        String genero = scanner.next ();

        System.out.println ( "Ingrese el color del animal:" );
        String color = scanner.next ();

        // Crear una nueva instancia de Animal con los datos proporcionados
        Animal nuevoAnimal = new Animal ( nombre, especie, edad, genero, color );

        // Aquí puedes hacer algo con el nuevo animal, como agregarlo a una lista de animales en tu zoológico, etc.
        System.out.println ( "¡Animal creado exitosamente!" );
    }

    public static void simuladorPoblacionalMenu ( Ambiente ambiente, Simulador simulador ) {
        Scanner scanner = new Scanner ( System.in );
        boolean salir = false;

        while (!salir) {
            System.out.println ( "\n--- Simulador de Dinámicas Poblacionales ---" );
            System.out.println ( "1. Simular Crecimiento y Reproducción" );
            System.out.println ( "2. Simular Eventos Aleatorios" );
            System.out.println ( "3. Ver Resultados de la Simulación" );
            System.out.println ( "4. Volver al Menú Principal" );
            System.out.print ( "Seleccione una opción: " );
            int opcion = scanner.nextInt ();
            scanner.nextLine (); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    simularCrecimientoYReproduccion ( ambiente, simulador );
                    // Lógica para simular el crecimiento y reproducción

                    break;
                case 2:
                    simularEventosAleatorios ( ambiente, simulador );
                    // Lógica para simular eventos aleatorios

                    break;
                case 3:
                    verResultadosSimulacion ( ambiente, simulador );
                    // Lógica para ver resultados de la simulación

                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println ( "Opción no válida, intente de nuevo." );
                    break;
            }
        }

    }

    public static void simularCrecimientoYReproduccion ( Ambiente ambiente, Simulador simulador ) {
        // Lógica para simular el crecimiento y reproducción
        simulador.simularCrecimientoYReproduccion ( ambiente, 3.0, 1000 );
        System.out.println ( "Simulación de crecimiento y reproducción realizada." );
    }

    public static void verResultadosSimulacion ( Ambiente ambiente, Simulador simulador ) {
        // Lógica para ver resultados de la simulación
        simulador.verResultadosSimulacion ( ambiente );
        // No es necesario imprimir aquí, ya que se imprime dentro del método verResultadosSimulacion
    }

    public static void simularEventosAleatorios ( Ambiente ambiente, Simulador simulador ) {
        Random random = new Random ();
        double probabilidadEvento = 0.8; // Probabilidad de que ocurra un evento aleatorio (80%)
        if (random.nextDouble () < probabilidadEvento) { // Comprobamos si ocurre un evento aleatorio según la probabilidad configurada
            int poblacionActual = ambiente.getPoblacion ();
            if (poblacionActual > 9) {
                int reduccion = random.nextInt ( Math.min ( poblacionActual, 10 ) ); // Reducción de hasta el 10% de la población actual
                int nuevaPoblacion = poblacionActual - reduccion;
                ambiente.setPoblacion ( nuevaPoblacion );
                System.out.println ( "Se ha producido un evento aleatorio. Población actual: " + nuevaPoblacion );
            } else {
                System.out.println ( "No ha ocurrido ningún evento aleatorio. La población actual es cero." );
            }
        } else {
            System.out.println ( "No ha ocurrido ningún evento aleatorio." );
        }
    }












