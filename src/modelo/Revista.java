package modelo;

public class Revista extends Publicacion {
    private int numero;

    public Revista(String titulo, String autor, int anio, int numero) {
        super(titulo, autor, anio);
        this.numero = numero;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de revista: " + numero);
    }
}