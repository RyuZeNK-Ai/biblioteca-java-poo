package modelo;

public class Publicacion {
    String titulo;// default
    protected String autor;// protected
    private int anio;// private


    public Publicacion(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + anio);
    }
}

