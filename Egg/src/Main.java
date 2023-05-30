// Crear un programa que pida el nombre de una persona y su edad. Luego mostrar por pantalla

import java.util.Scanner;

public class Main {
    public static void main(String[] a) {

        Scanner scan = new Scanner(System.in);
        String nombre;
        int edad;

        double numero;
        String letra;
        System.out.println( "Ingrese su nombre: ");
        nombre = scan.nextLine();
        System.out.println( "Ingrese su edad: ");
        edad = scan.nextInt();
        System.out.println( "Ingrese un numero y una letra: ");
        numero = scan.nextDouble();
        scan.skip("\n");
        letra = scan.nextLine();
        System.out.println("Hola " + nombre + "! Tienes " + edad + " años y estás programando en Java!");
        System.out.println(numero + " " + letra);
        System.out.println(letra);



    }
}