/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */

import java.util.Scanner;
public class Ejercicio_asteriscos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        for ( int i = 0 ; i < 4; i++) {
            String asterisco =  " ";
            System.out.println("Ingrese un número");
            num = scan.nextInt();
            for ( int j = 0; j < num; j ++) {
                asterisco = asterisco + "*";
            }
            System.out.println(num + asterisco);
        }
    }
}