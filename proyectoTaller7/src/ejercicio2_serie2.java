/***
 * Problema 2
 * Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 * 5/10
 * 10/12
 * 15/14
 * 20/16
 * 25/18
 * 30/20
 */
import java.util.Scanner;
public class ejercicio2_serie2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int con = 5, limite;
        int deno = 10;
        System.out.println("Dame el limite: ");
        limite = teclado.nextInt();
        while (con <= limite){
            System.out.println(con + "/" + deno);
            con = con + 5;
            deno = deno + 2;
        }
    }
}
/***
 * run:
 * Dame el limite: 30
 * 5/10
 * 10/12
 * 15/14
 * 20/16
 * 25/18
 * 30/20
 */