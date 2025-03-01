import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProyectoOrdenamiento {

    private static List<Integer> listaDatos = new ArrayList<>();

    public static void mostrarInformacion() {
        // Datos fijos del proyecto
        String universidad = "Universidad Da Vinci de Guatemala";
        String curso = "Estructura de Datos";
        String docente = "Ing. Brandon Chitay";

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del estudiante
        System.out.print("Ingrese su nombre: ");
        String estudiante = scanner.nextLine();
        System.out.print("Ingrese su número de carné: ");
        String carnet = scanner.nextLine();

        // Listas de tareas completadas
        List<String> puntosHechos = new ArrayList<>();
        puntosHechos.add("1. Información del Desarrollador");
        puntosHechos.add("2. Menú Principal");
        puntosHechos.add("3. Carga de Datos desde un CSV");
        puntosHechos.add("4. Algoritmo de Ordenamiento - Bubble Sort");
        puntosHechos.add("5. Algoritmo de Ordenamiento - Enhanced Bubble Sort");
        puntosHechos.add("6. Algoritmo de Ordenamiento - Quick Sort");
        puntosHechos.add("7. Algoritmo de Ordenamiento - Selection Sort");
        puntosHechos.add("8. Algoritmo de Ordenamiento - Merge Sort");
        puntosHechos.add("9. Algoritmo de Búsqueda - Binary Search");
        puntosHechos.add("10. Presentación Final en YouTube");

        // Mostrar la información en consola
        System.out.println("\n========================================");
        System.out.println(universidad);
        System.out.println(curso);
        System.out.println(docente + "\n");
        System.out.println("Nombre del estudiante: " + estudiante);
        System.out.println("Carné del estudiante: " + carnet + "\n");

        // Mostrar tareas completadas
        System.out.println("PUNTOS HECHOS:");
        for (String punto : puntosHechos) {
            System.out.println("✅ " + punto);
        }

        System.out.println("========================================");

        // Esperar a que el usuario presione Enter antes de continuar
        System.out.println("Presione Enter para continuar...");
        scanner.nextLine();

        // Llamar al menú principal
        mostrarMenu(scanner);
    }

    public static void mostrarDatosCreador() {
        System.out.println("\n========== DATOS DEL CREADOR ==========");
        System.out.println("👨‍💻 Nombre: Gustavo David Campos Morales");
        System.out.println("📧 Contacto: 202400509@estudiante.udv.edu.gt");
        System.out.println("🔗 GitHub: github.com/TavoDcm");
        System.out.println("📜 Descripción: Aprendiendo a desarrollar con pasión.");
        System.out.println("========================================");
    }

    public static void mostrarMenu(Scanner scanner) {
        int opcion;
        do {
            // Mostrar opciones
            System.out.println("\n========== MENÚ PRINCIPAL ==========");
            System.out.println("1. Cargar datos desde un archivo CSV");
            System.out.println("2. Ordenar datos usando Bubble Sort");
            System.out.println("3. Ordenar datos usando Enhanced Bubble Sort");
            System.out.println("4. Ordenar datos usando Quick Sort");
            System.out.println("5. Ordenar datos usando Selection Sort");
            System.out.println("6. Ordenar datos usando Merge Sort");
            System.out.println("7. Buscar un número con Binary Search");
            System.out.println("8. Mostrar datos del creador");
            System.out.println("9. Salir");
            System.out.print("Ingrese una opción: ");

            // Leer opción del usuario
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            // Ejecutar la acción correspondiente
            switch (opcion) {
                case 1:
                    CargarDatosCSV.opcionCargarDatos(listaDatos);
                    break;
                case 2:
                    BubbleSort.opcionBubbleSort(listaDatos);
                    break;
                case 3:
                    EnhancedBubbleSort.opcionEnhancedBubbleSort(listaDatos);
                    break;
                case 4:
                    QuickSort.opcionQuickSort(listaDatos);
                    break;
                case 5:
                    SelectionSort.opcionSelectionSort(listaDatos);
                    break;
                case 6:
                    MergeSort.opcionMergeSort(listaDatos);
                    break;
                case 7:
                    BinarySearch.opcionBinarySearch(scanner, listaDatos);
                    break;
                case 8:
                    mostrarDatosCreador();
                    break;
                case 9:
                    System.out.println("👋 Saliendo del programa...");
                    break;
                default:
                    System.out.println("⚠️ Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 9);
    }

    public static void main(String[] args) {
        mostrarInformacion();
    }
}
