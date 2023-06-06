//Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int nota;
        System.out.println("Ingrese una nota entre 0 y 10: ");
        nota = scan.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("La nota ingresada no es valida, ingrese una nota entre 0 y 10: ");
            nota = scan.nextInt();
        }
        System.out.println("La nota ingresada es: " + nota);
    }
}

