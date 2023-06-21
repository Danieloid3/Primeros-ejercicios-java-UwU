
/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
        introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
        función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
        una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
        (void).
        El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €import java.util.Scanner;

 */
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double euros;
        String moneda;
        System.out.println("Ingrese una cantidad de euros");
        euros = scan.nextDouble();
        System.out.println("Ingrese una moneda a convertir (libras, dolares, yenes)");
        moneda = scan.next();
        convertir(euros, moneda);


    }
    public static void convertir(double euros, String moneda){
        double libras = 0.86;
        double dolares = 1.28611;
        double yenes = 129.852;
        if (moneda.equals("libras")){
            System.out.println(euros + " euros son " + euros*libras + " libras");
        }else if(moneda.equals("dolares")){
            System.out.println(euros + " euros son " + euros*dolares + " dolares");
        }else if(moneda.equals("yenes")){
            System.out.println(euros + " euros son " + euros*yenes + " yenes");
        }else{
            System.out.println("Moneda incorrecta");
        }
    }
}
