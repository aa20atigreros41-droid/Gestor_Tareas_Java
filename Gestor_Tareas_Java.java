import java.util.List;
import java.util.ArrayList;

public class Gestor_Tareas_Java {
    public static void eliminarTarea(ArrayList<String> tareas, int indice){
		int b = tareas.remove(indice);
		if(b<0){
			System.out.println("No se pudo eliminar la tarea porque no existe");
		}
	}
    public static void main(String[] args) {

        ArrayList<String> tareas = new ArrayList<>();

        switch (args[0]) {
            case "agregar":
                String tarea = args[1];
                tareas.add(tarea);
                System.out.println("Tarea agregada: " + tarea);
                break;
            case "listar":
                System.out.println("Lista de tareas:");
                for (String t : tareas) {
                    System.out.println("- " + t);
                }
                break;
            case "modificar":
                String tareaVieja = args[1];
                String tareaNueva = args[2];
                tareas.remove(tareaVieja);
                tareas.add(tareaNueva);
                System.out.println("Tarea modificada: " + tareaVieja + " -> " + tareaNueva);
                break;
            default:
                System.out.println("Comando no reconocido. Usa 'agregar', 'listar' o 'modificar'.");
        }
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

	public void listar_tareas_java(ArrayList<String> tareasGit) {
		if (tareas.isEmpty()) {
			System.out.println("No hay tareas.");
			return;
		}

		for (int i = 0; i < tareas.size(); i++) {
			System.out.println((i + 1) + ". " + tareas.get(i));
		}
	}

    public List<String> getTareas() {
        return tareas;
      
}
