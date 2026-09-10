import Model.Biblioteca;
import Model.Libro;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        ArrayList<Libro> listaDePrueba = new ArrayList<>();

        Biblioteca miBiblioteca = new Biblioteca(listaDePrueba);

        Libro libro1 = new Libro("Juanjo", "Jose", 13.242, 1999);
        Libro libro2 = new Libro("Franco", "Felipe", 10.231, 2002);

        miBiblioteca.agregarlibro(libro1);
        miBiblioteca.agregarlibro(libro2);


        System.out.println("-------------------Cantidad actual de libros------------------");
        miBiblioteca.mostrarLibros();

        System.out.println("total de libros: " + miBiblioteca.totalLibros());
        System.out.println("precio total: " + miBiblioteca.precioTotalLibros());
        Libro caro = miBiblioteca.libroMasCaro();
        System.out.println("Libro mas caro: " + caro);
        System.out.println();
        Libro barato = miBiblioteca.libroMasBarato();
        System.out.println("El libro mas barato es: " + barato);

        miBiblioteca.eliminarLibro("Franco");
        System.out.println("---------------------Cantidad actual de libros despues de eliminar-----------------");
        miBiblioteca.mostrarLibros();
        System.out.println("total de libros: " + miBiblioteca.totalLibros());

        miBiblioteca.actualizarPrecio(14000, "Juanjo");
        System.out.println("--------------Precio con los libros actualizados------------------");
        miBiblioteca.mostrarLibros();







    }




}
