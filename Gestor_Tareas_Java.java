import java.util.List;
import java.util.ArrayList;

public class Gestor_Tareas_Java {
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
}