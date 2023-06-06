/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */

import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        int opcion;
        String salir = "No";

        System.out.println("Ingrese el primer número para realizar las operaciones");
        num1 = scan.nextInt();

        System.out.println("Ingrese el segundo número para realizar las operaciones");
        num2 = scan.nextInt();

        System.out.println("MENU \n");
        System.out.println ("1. Sumar\n" +
                "2. Restar\n" +
                "3. Multiplicar\n" +
                "4. Dividir\n" +
                "5. Salir");

        do{
            System.out.println("Elija opción:");
            opcion = scan.nextInt();

            switch (opcion){
                case 1:
                    System.out.println(num1 + "+" + num2 + "=" + sumar(num1, num2));
                    break;
                case 2:
                    System.out.println(num1 + "-" + num2 + "=" + restar(num1, num2));
                    break;
                case 3:
                    System.out.println(num1 + "x" + num2 + "=" + multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println(num1 + "/" + num2 + "=" + dividir(num1, num2));
                    break;
                case 5:
                    System.out.println("Está seguro que desea salir?");
                    scan.skip("\n");
                    salir = scan.nextLine();
                    if (salir.equals("Si")){
                        System.out.println("Finalizar programa");
                    }
                    break;

            }

        }while(salir.equals("No"));

    }
    public static int sumar (int a, int b){
        int suma;
        suma = a + b;
        return suma;
    }
    public static int restar (int a, int b) {
        int resta;
        resta = a - b;
        return resta;
    }
    public static int multiplicar (int a, int b) {
        int multiplicacion;
        multiplicacion = a * b;
        return multiplicacion;
    }
    public static int dividir (int a, int b) {
        int division;
        division = a / b;
        return division;
    }
}

