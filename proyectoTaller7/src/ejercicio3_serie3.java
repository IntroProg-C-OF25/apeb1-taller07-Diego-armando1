/***
 * Realizar un programa Java que permita pedir por teclado el nombre 
 * de 5 empleados. Por cada empleado se debe solicitar el nombre, numero 
 * de días trabajados y costo del día trabajo. Calcular el valor a 
 * cancelar por la empresa para cada empleado. Presentar un reporte 
 * como el siguiente:
Nombre 1	10	$2.5	$25
Nombre 2	11	$2	$22
Nombre 3	9	$3	$27
Nombre 4	5	$4	$20
Nombre 5	12	$2	$24
 * @author hp
 */
import java.util.Scanner;
public class ejercicio3_serie3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nom = new String[5];
        double[] costoTra = new double[5]; 
        double[] costoTotal = new double [5];
        int cont = 0;
        int[] diasTra = new int [5];
        while (cont < 5) {
            System.out.println("\n--- Ingreso de datos del empleado" + (cont + 1) + "---");
            System.out.println("Ingrese el nombre del empleado: ");
            nom[cont] = teclado.next();
            System.out.print("Ingrese los dias de trabajo: ");
            diasTra[cont] = teclado.nextInt();
            System.out.println("Ingrese el costo del trabajo: ");
            costoTra[cont] = teclado.nextDouble();
           costoTotal[cont] = diasTra[cont] * costoTra[cont];
           cont++;
        }
        System.out.println("\nReporte de empleados");
        System.out.println("Nombre\tdias\tcosto\t\tTotal");
        cont = 0;
        while (cont < 5){
            System.out.printf("%s\t%d\t$%.2f\t\t$%.2f\n", nom[cont], diasTra[cont], costoTra[cont], costoTotal[cont]);
        cont++;   
        }
    }
}
/***
 * run:
 * --- Ingreso de datos del empleado1---
 * Ingrese el nombre del empleado: Diego
 * Ingrese los dias de trabajo: 30
 *Ingrese el costo del trabajo: 5
 * 
 * --- Ingreso de datos del empleado2---
 * Ingrese el nombre del empleado: Julian
 * Ingrese los dias de trabajo: 20
 * Ingrese el costo del trabajo: 5

 * --- Ingreso de datos del empleado3---
 * Ingrese el nombre del empleado: Rodrigo
 * Ingrese los dias de trabajo: 40
 * Ingrese el costo del trabajo: 5
 
 * --- Ingreso de datos del empleado4---
 * Ingrese el nombre del empleado: Lucio
 * Ingrese los dias de trabajo: 20
 * Ingrese el costo del trabajo: 5

 * --- Ingreso de datos del empleado5---
 * Ingrese el nombre del empleado: Paul
 * Ingrese los dias de trabajo: 10
 * Ingrese el costo del trabajo: 5
 * Reporte de empleados
Nombre	dias	costo		Total
Diego	30	$5,00		$150,00
Julian	20	$5,00		$100,00
Rodrigo	40	$5,00		$200,00
Lucio	20	$5,00		$100,00
Paul	10	$5,00		$50,00
 */