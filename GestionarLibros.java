package Interface;

import Model.Libro;

public interface GestionarLibros {

    void agregarlibro(Libro nuevoLibro);
    void eliminarLibro(String sacarLibro);
    void mostrarLibros();
    Libro libroTitulo(String titulo);
    void actualizarPrecio(double nuevoPrecio, String tituloLibro);
    double precioTotalLibros();
    int totalLibros();
    Libro libroMasCaro();
    Libro libroMasBarato();
}
