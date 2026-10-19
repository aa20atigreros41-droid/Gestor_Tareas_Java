import java.util.ArrayList;
import java.util.List;

class listar_tareas {
	private final List<String> tareas = new ArrayList<>();

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
}
