/***
 * Problema 7
 * Generar e imprimir la siguiente serie:
 * sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 */
import java.util.Scanner;
public class ejercicio7_serie7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont1 = 1, cont = 1, elementos;
        String signo = null;
        System.out.print("Ingrese la cantidad de elementos: ");
        elementos = teclado.nextInt();
        while(cont <= elementos) {
            cont1 = cont1 * -1;
            if (cont1 >= 1)
                signo = "+";
            else
                signo = "-";
              System.out.println( signo + " (" + 1 + "/" + cont + ") ");
            cont++;
        }
    }
}
/***
 * run:
 * Ingrese la cantidad de elementos: 10
 * - (1/1) 
 * + (1/2) 
 * - (1/3) 
 * + (1/4) 
 * - (1/5) 
 * + (1/6) 
 * - (1/7) 
 * + (1/8) 
 * - (1/9) 
 * + (1/10) 
 */