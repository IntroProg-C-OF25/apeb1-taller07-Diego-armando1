/***
 * Problema 1
 * Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 * 1/10
 * 2/11
 * 3/12
 * 4/13
 * 5/14
 * 6/15
 */
import java.util.Scanner;
public class ejercicio1_serie1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 1, limite;
        System.out.print("Dame el limite: ");
        limite = teclado.nextInt();
        while (contador <= limite){
            System.out.print(contador + "/" + (contador+9) + ", ");
            contador++;
        }
        System.out.println("");
    }
}
/***
 * run:
 * Dame el limite: 10
 * 1/10, 2/11, 3/12, 4/13, 5/14, 6/15, 7/16, 8/17, 9/18, 10/19, 
 */