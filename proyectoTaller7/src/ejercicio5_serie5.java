/***
 * Generar un programa Java que permita ingresar 4 estudiantes; por cada 
 * uno de ellos ingresar el nombre del estudiante, el promedio de ciclo. 
 * Presentar el siguiente reporte
 * Estudiante 1	10	Aprobado
 * Estudiante 2	6.9	Reprobado
 * Estudiante 3	7	Aprobado
 * Estudiante 4	5	Reprobado
 * Atención; con base al valor del promedio, usted debe asignar en cada 
 * registro el tipo Aprobado o Reprobado.
 */
import java.util.Scanner;
public class ejercicio5_serie5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nom = new String[4];
        double[] pro = new double[4];
        String[] estado = new String[4];
        int i = 1;
        while (i < 4){
            System.out.print("Ingrese el nombre y promedio del est_" + i + ": ");
            nom[i] = teclado.next().toLowerCase();
             pro[i] = teclado.nextDouble();
            if (pro[i] < 7)
                estado[i] = "Reprobado";
            else
                estado[i] = "Aprobado";  
            i++;
        }
        System.out.printf("| %s | %s | %s |%n", "NOMBRE", "PROMEDIO", "ESTADO");
        i = 1;
        while(i < 4){
            System.out.printf("| %s | %.2f\t| %s |%n", nom[i], pro[i], estado[i]);
            i++;
        }

    }
}
/***
 * run:
 * Ingrese el nombre y promedio del est_1: Diego 7
 * Ingrese el nombre y promedio del est_2: Julian 8
 * Ingrese el nombre y promedio del est_3: Lucio 6
| NOMBRE | PROMEDIO | ESTADO |
| diego | 7,00	| Aprobado |
| julian | 8,00	| Aprobado |
| lucio | 6,00	| Reprobado |
 */   

