/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String cadena;
        String FDE = "&&&&&";
        int correcto = 0;
        int incorrecto = 0;

        do{
            System.out.println("Ingrese una cadena de 5 caracteres");
            cadena = scan.nextLine();
            if (cadena.length()!=5){
                System.out.println("Cantidad de caracteres incorrecta");
            }
        }while(cadena.length() != 5);

        do{

            if (cadena.substring(0,1).equals("X") && cadena.substring(4,5).equals("O")){
             correcto += 1;
            }else if(cadena.equals(FDE)){
                System.out.println("Finalizar programa");
                break;
            }else{
                incorrecto += 1;
            }
            do{
                System.out.println("Ingrese una cadena de 5 caracteres");
                cadena = scan.nextLine();
                if (cadena.length()!=5){
                    System.out.println("Cantidad de caracteres incorrecta");
                }
            }while(cadena.length() != 5);
        }while(!cadena.equals(FDE));
        System.out.println("La cantidad de cadenas correctas fue de: " + correcto );
        System.out.println("La cantidad de cadenas incorrectas fue de: " + incorrecto );
    }
}