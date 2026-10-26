import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Gestor_Tareas_Java {
    public static void eliminarTarea(ArrayList<String> tareas, int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            String eliminada = tareas.remove(indice);
            System.out.println("Tarea '" + eliminada + "' eliminada correctamente.");
        } else {
            System.out.println("No se pudo eliminar la tarea porque no existe.");
        }
    }3

    public static void main(String[] args) {

        ArrayList<String> tareas = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String opcion = "";
		do{
			System.out.println("------------------------------");
            System.out.println("- 1. Crear tareas            -");
            System.out.println("- 2. Borrar tareas           -");
            System.out.println("- 3. Listar tareas           -");
            System.out.println("- q. Salir                   -");
            System.out.println("------------------------------");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextLine().trim();
			switch (opcion.toLowerCase()) {
				case "1":
					agregarTareas(tareas, scanner);
					break;
				case "2":
					if (tareas.isEmpty()) {
                        System.out.println("No hay tareas para eliminar.");
                    } else {
                        System.out.println("\n--- Lista actual de tareas ---");
                        for (int i = 0; i < tareas.size(); i++) {
                            System.out.println((i + 1) + ". " + tareas.get(i));
                        }
                        
                        System.out.print("Introduce el número de la tarea que deseas eliminar: ");
                        try {
                            int numero = Integer.parseInt(scanner.nextLine().trim());
                            // Convertimos la posición visible (1..N) al índice base 0 del ArrayList
                            eliminarTarea(tareas, numero - 1);
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Debes introducir un número válido.");
                        }
                    }
					break;
				case "3":
					listar_tareas_java(tareas);
					break;
                case "q":
                    System.out.println("Saliendo del programa...");
                    break;
				default:
					System.out.println("Comando no reconocido. Usa 'agregar', 'listar' o 'modificar'.");
			}
		} while (!opcion.equalsIgnoreCase("q"));
		scanner.close();
    }

	
	// Método para agregar tareas hasta que el usuario devuelva una "q" para salir
	public static void agregarTareas(ArrayList<String> tareas, Scanner scanner) {
        String entrada;
        while (true) {
            System.out.println("Introduce una tarea ('q' para salir)");
            entrada = scanner.nextLine().trim();
            // Si meten una "q" se sale del bucle.
            if (entrada.equalsIgnoreCase("q")) {
                break;
            }
            // Compruebo que no se agreguen tareas vacías.
            if (!entrada.isEmpty()) {
                tareas.add(entrada);
                System.out.println("Tarea agregada correctamente.");
            } else {
                System.out.println("La tarea no puede estar vacía.");
            }
        }
    }

	public static void listar_tareas_java(ArrayList<String> tareas) {
		if (tareas.isEmpty()) {
			System.out.println("No hay tareas.");
			return;
		}

		for (int i = 0; i < tareas.size(); i++) {
			System.out.println((i + 1) + ". " + tareas.get(i));
		}
	}
}
