/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
        dos. El programa deberá después mostrar el resultado de la suma
*/

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1, num2, suma;

        System.out.println("Ingrese el primer número: ");
        num1 = scan.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = scan.nextInt();

        suma = num1 + num2;
        System.out.println("La suma de los dos números ingresados es: " + suma);

    }
}