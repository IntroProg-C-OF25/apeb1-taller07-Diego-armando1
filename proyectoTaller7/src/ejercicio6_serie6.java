
/** *
 * Problema 6
 * Una empresa de comercialización de computadoras realiza el proceso de
 * venta haciendo un descuento por tipo de cliente: Si es cliente tipo 1
 * hay un descuento del 10% Si es cliente tipo 2 hay un descuento del 20%
 * En caso que sea otro tipo de cliente, no hay descuento. Generar un proceso
 * que permita ingresar 7 ventas: por cada venta preguntar los siguiente datos:
 *
 * Nombre del cliente
 * Costo de la computadora (solo se vende una computadora por transacción)
 * Tipo de cliente Presentar el siguiente reporte: Cliente tipo 1, compra computadora con precio $100
 *
 * @author hp
 */
import java.util.Scanner;
public class ejercicio6_serie6 {
    public static void main(String[] args) {
        String[] nom = new String[7];
        int[] costo = new int[7];
        int[] tipo = new int[7];
        double[] des = new double[7];
        double[] costoFinal = new double[7];
        int i = 0;
        Scanner teclado = new Scanner(System.in);
        while (i < 7) {
            System.out.println("\n ---Datos de la compra" + (i + 1) + "---");
            System.out.println("Ingrese el nombre del cliente: ");
            nom[i] = teclado.next().toLowerCase();
            System.out.println("Ingrese el costo de la computadora: ");
            costo[i] = teclado.nextInt();
            System.out.println("Ingrese el tipo de cliente: ");
            tipo[i] = teclado.nextInt();
            switch (tipo[i]) {
                case 1:
                    des[i] = costo[i] * 0.10;
                    break;
                case 2:
                    des[i] = costo[i] * 0.20;
                    break;
                case 3:
                    des[i] = 0;
                    break;
                default:
                    System.out.println("Tipo de cliente inválido.");
            }
            costoFinal[i] = costo[i] - des[i];
            i++;
        }
        System.out.println("\tNombre\tCosto de la computadora\tTipo de cliente\tCosto final");
        i = 0;
        while (i < 7) { 
            System.out.printf("%s\t\t$%d\t\t\t%d\t\t$%.2f\n",nom[i], costo[i], tipo[i], costoFinal[i]);
            i++;
        }

    }
}
/***
 * run:
 * Nombre	Costo de la computadora	Tipo de cliente	Costo final
Diego		$450			1		$405,00
Paul		$780			2		$624,00
Rodrigo		$340			3		$340,00
Dayana		$450			1		$405,00
Lucio		$650			3		$650,00
Julian		$380			2		$304,00
Pedro		$580			3		$580,00
 */
