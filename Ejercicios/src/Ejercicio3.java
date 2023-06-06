/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase: ");
        frase = scan.nextLine();
        System.out.println("La frase ingresada en mayúsculas es: " + frase.toUpperCase());
        System.out.println("La frase ingresada en minúsculas es: " + frase.toLowerCase());

    }
}
