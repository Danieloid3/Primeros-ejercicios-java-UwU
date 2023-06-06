/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
        pantalla.
*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre: ");
        nombre = scan.nextLine();
        System.out.println("Su nombre es: " + nombre);

    }
}
