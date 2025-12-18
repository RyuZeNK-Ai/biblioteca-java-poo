package servicios;

import modelo.Libro;
import modelo.Revista;
import modelo.Publicacion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorBiblioteca gestor = new GestorBiblioteca();
        int opcion;

        do {
            System.out.println("\n=== MENÚ BIBLIOTECA ===");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Agregar Revista");
            System.out.println("3. Mostrar todas las publicaciones");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    agregarLibro(scanner, gestor);
                    break;
                case 2:
                    agregarRevista(scanner, gestor);
                    break;
                case 3:
                    mostrarPublicaciones(gestor);
                    break;
                case 4:
                    System.out.println("¡Gracias por usar el sistema!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 4);

        scanner.close();
    }

    private static void agregarLibro(Scanner scanner, GestorBiblioteca gestor) {
        System.out.println("\n--- AGREGAR NUEVO LIBRO ---");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        System.out.print("Año: ");
        int anio = scanner.nextInt();

        System.out.print("Número de páginas: ");
        int paginas = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        Libro libro = new Libro(titulo, autor, anio, paginas);
        gestor.agregarPublicacion(libro);
        System.out.println("✓ Libro agregado exitosamente!");
    }

    private static void agregarRevista(Scanner scanner, GestorBiblioteca gestor) {
        System.out.println("\n--- AGREGAR NUEVA REVISTA ---");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Autor/Editorial: ");
        String autor = scanner.nextLine();

        System.out.print("Año: ");
        int anio = scanner.nextInt();

        System.out.print("Número de revista: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        Revista revista = new Revista(titulo, autor, anio, numero);
        gestor.agregarPublicacion(revista);
        System.out.println("✓ Revista agregada exitosamente!");
    }

    private static void mostrarPublicaciones(GestorBiblioteca gestor) {
        System.out.println("\n=== LISTA DE PUBLICACIONES ===");
        if (gestor.getCantidadPublicaciones() == 0) {
            System.out.println("No hay publicaciones registradas.");
        } else {
            gestor.mostrarTodo();
        }
    }
}