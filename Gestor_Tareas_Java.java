import java.util.List;
import java.util.ArrayList;

public class Gestor_Tareas_Java {
    public static void main(String[] args) {

        ArrayList<String> tareas = new ArrayList<>();

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
}