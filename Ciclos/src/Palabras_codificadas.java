/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
        en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
        reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
        vocales acentuadas) se mantienen sin cambios.
        a = @ e = # i = $ o = % u = *
 */
import java.util.Scanner;
public class Palabras_codificadas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palabra;
        String palabra_codificada = "";
        System.out.println("Ingrese una palabra o frase: ");
        palabra = scan.nextLine();
        for (int i = 0; i < palabra.length(); i++) {
            switch (palabra.charAt(i)) {
                case 'a':
                    palabra_codificada += '@';
                    break;
                case 'e':
                    palabra_codificada += '#';
                    break;
                case 'i':
                    palabra_codificada += '$';
                    break;
                case 'o':
                    palabra_codificada += '%';
                    break;
                case 'u':
                    palabra_codificada += '*';
                    break;
                default:
                    palabra_codificada += palabra.charAt(i);
                    break;
            }
        }
        System.out.println("La palabra o frase codificada es: " + palabra_codificada);
    }


}
