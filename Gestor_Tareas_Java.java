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

    }
}
