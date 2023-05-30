//programa que le pida dos números enteros a usuario y determine si ambos o alguno de ellos es mayor a 25.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingrese un numero: ");
        num1 = scan.nextInt();
        System.out.println("Ingrese otro numero: ");
        num2 = scan.nextInt();
        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos numeros son mayores a 25");
        } else if ((num1 > 25) || (num2 > 25)) {
            System.out.println("Alguno de los numeros es mayor a 25");
        } else {
            System.out.println("Ninguno de los numeros es mayor a 25");
        }

    }
}