/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int limite;
        int num;
        int suma = 0;

        System.out.println("Ingrese el límite de la suma");
        limite = scan.nextInt();

        while(suma <= limite){
            System.out.println("Ingrese un número para sumar");
            num = scan.nextInt();
            suma += num;
        }
        System.out.println("La suma de los números ha superado el límite");
    }
}