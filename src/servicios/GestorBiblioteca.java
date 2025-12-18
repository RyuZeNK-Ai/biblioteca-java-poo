package servicios;

import modelo.Publicacion;
import java.util.ArrayList;

public class GestorBiblioteca {
    private ArrayList<Publicacion> publicaciones = new ArrayList<>();

    public void agregarPublicacion(Publicacion p) {
        publicaciones.add(p);
    }

    public void mostrarTodo() {
        int contador = 1;
        for (Publicacion p : publicaciones) {
            System.out.println("\n[" + contador + "] " +
                    (p instanceof modelo.Libro ? "📚 LIBRO" : "📰 REVISTA"));
            p.mostrarInformacion();
            contador++;
        }
        System.out.println("\nTotal: " + publicaciones.size() + " publicaciones");
    }

    public int getCantidadPublicaciones() {
        return publicaciones.size();
    }
}