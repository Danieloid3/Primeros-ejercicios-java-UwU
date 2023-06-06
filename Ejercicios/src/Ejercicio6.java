/*
Crear un programa que dado un numero determine si es par o impar.
 */
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un número");
        num = scan.nextInt();

        if (num % 2 == 0){
            System.out.println("El número ingresado es par");
        }else{
            System.out.println("El número ingresado es impar");
        }
    }
}
