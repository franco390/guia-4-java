package Model;

import java.util.Objects;

public class Persona {

    private String nombre;
    private int edad;
    private String  DNI;
    private char genero;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.DNI = DNI;
        this.genero = 'H';
    }

    public Persona(String nombre, int edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.DNI = String.valueOf((Math.random() * 9000000 + 10000000));
        comprobarGenero(genero);

    }

    public Persona(String nombre, int edad, char genero, String DNI) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.DNI = DNI;
    }

    public String  getDNI() {
        return DNI;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(DNI, persona.DNI);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(DNI);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", genero='" + genero + '\'' +
                '}';
    }

    public boolean mayorEdad(){

        return edad>=18;
    }

    public void comprobarGenero(char genero) {

        if (genero == 'H' || genero == 'F') {

            this.genero = genero;
        } else {

           this.genero = 'H';

        }


    }

    }
