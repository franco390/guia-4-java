import Model.Persona;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        Scanner ricardo = new Scanner(System.in);

        Persona Juan = new Persona("Carlos", 18, 'f');
        System.out.println(Juan);


        System.out.println("Escriba su nombre: ");
        Juan.setNombre(ricardo.nextLine());
        System.out.println("Ingrese su edad: ");
        Juan.setEdad(ricardo.nextInt());
        System.out.println("Ingrese su genero (H o F): ");
        Juan.setGenero(ricardo.next().charAt(0));
        System.out.println(Juan);

        Persona orasio = new Persona();








    }

}
