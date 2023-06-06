/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int cent;
        int faren;
        System.out.println("Ingrese una temperatura en grados centigrados: ");
        cent = scan.nextInt();
        faren = 32 + (9*cent/5);
        System.out.println(cent + " grados Centigrados son " + faren + " grados Fahrenheit");
    }
}
