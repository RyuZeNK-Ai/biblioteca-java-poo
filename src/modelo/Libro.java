package modelo;

public class Libro extends Publicacion {
    private int paginas;

    public Libro(String titulo, String autor, int anio, int paginas) {
        super(titulo, autor, anio);
        this.paginas = paginas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Páginas: " + paginas);
    }
}