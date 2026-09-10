package Model;

import Interface.GestionarLibros;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Biblioteca implements GestionarLibros {

    private ArrayList<Libro> listaLibros;

    public Biblioteca(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }



    @Override
    public void agregarlibro(Libro nuevoLibro) {
        listaLibros.add(nuevoLibro);
    }

    @Override
    public void eliminarLibro(String sacarLibro) {

        for (Libro L : listaLibros){
            if(sacarLibro.equals(L.getTitulo())){
                listaLibros.remove(L);
                return;
            }
        }

    }

    @Override
    public void mostrarLibros() {

        for (Libro L : listaLibros){
            System.out.println(L);
        }

    }

    @Override
    public Libro libroTitulo(String titulo) {

        for (Libro L : listaLibros){
            if(titulo.equals(L.getTitulo())){

                return L;
            }
        }
        return null;
    }

    @Override
    public void actualizarPrecio(double nuevoPrecio, String tituloLibro) {

        for (Libro L : listaLibros){

            if (tituloLibro.equals(L.getTitulo())){

                L.setPrecio(nuevoPrecio);

                break;

            }
        }

    }

    @Override
    public double precioTotalLibros() {
        double total = 0;
        for (Libro L : listaLibros){

            total += L.getPrecio();
        }

        return total;
    }

    @Override
    public int totalLibros() {

        return listaLibros.size();
    }

    @Override
    public Libro libroMasCaro() {

        Libro masCaro = listaLibros.get(0);

        for (Libro L : listaLibros){

            if (L.getPrecio() > masCaro.getPrecio()){

                masCaro = L;

            }
        }
        return masCaro;
    }

    @Override
    public Libro libroMasBarato() {
        Libro masBarato = listaLibros.get(0);

        for (Libro L : listaLibros){

            if (L.getPrecio() < masBarato.getPrecio()){

                masBarato = L;
            }
        }
        return masBarato;
    }
}
