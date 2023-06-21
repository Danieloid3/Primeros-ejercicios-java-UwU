/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vector = new int[100];
        for (int i = 0; i < vector.length; i++){
            vector[i] = i+1;
        }
        for (int i = vector.length-1; i >= 0; i--){
            System.out.print(vector[i] + " ");
        }
    }
}
