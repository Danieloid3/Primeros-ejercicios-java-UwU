/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */

import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Ingrese un numero");
        n = scan.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("*"+" ");
        }
        System.out.println("");
        for (int i = 0; i < n-2; i++){
            System.out.print("*"+" ");
            for (int j = 0; j < n-2; j++){
                System.out.print("  ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < n; i++){
            System.out.print("*"+" ");
        }


    }
}