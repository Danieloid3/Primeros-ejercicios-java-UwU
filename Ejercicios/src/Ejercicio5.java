/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;
        int doble;
        int triple;
        double raiz;
        System.out.println("Ingrese un número entero: ");
        num = scan.nextInt();
        doble = num*2;
        triple = num*3;
        raiz = Math.sqrt(num);
        System.out.println("El doble de " + num + " es " + doble + " , el triple es " + triple + " y su raiz cuadrada es " + raiz);
    }
}
