

import java.util.Scanner;
public class Opinion {
    public static void main(String[] a) {

        int opinion;
        Scanner scan = new Scanner(System.in);
        System.out.println("Clasifique la peli de 1 a 5 estrellas");
        opinion = scan.nextInt();

        if ( opinion >= 1 && opinion <= 5 ) {

            switch (opinion) {
                case 1:
                case 2:
                    System.out.println("Nos sentimos apenados de que no hayas disfrutado la peli :(");
                    break;
                case 3:
                    System.out.println("Has calificado la peli como buena");
                    break;
                case 4:
                    System.out.println("Has calificado la peli como muy buena!");
                    break;
                case 5:
                    System.out.println("Has calificado la peli como excelente!");
                    break;
            }
        }else if ( opinion < 0 ) {
                System.out.println("¿Una opinión negativa? ¿Tan mala fue la peli? :(");
        }else if ( opinion == 0 ) {
                System.out.println("El valor " + opinion + " no es válido y no se tomará en cuenta :(");
        }else {
                System.out.println(opinion + "! Wow! Eso es más de 5 estrellas! Gracias por tu opinión!");
            }
            System.out.println("Hasta la próxima!");
        }
}
