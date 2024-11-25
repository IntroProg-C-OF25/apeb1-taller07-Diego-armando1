
/** *
 * Problema 4
 * Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar:
 * Nombre el jugador
 * Posición en el campo de juego
 * Edad
 * Estatura
 * El ciclo de ingreso de información deberá terminar cuando el usuario
 * lo decida. Se debe imprimir el siguiente reporte (usar una cadena de acumulación):
 *
 * Listado de Jugadores
 * 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
 * 2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
 * 3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
 * 4. Ángel Mena -Delantero-, edad 32, estatura 1.75
 * 5. Michael Estrada -Delantero-, edad 27, estatura 1.93
 * Promedio de edades:  26.8
 * Promedio de estaturas: 1.87
 *
 * @author hp
 */
import java.util.Scanner;

public class ejercicio4_serie4 {

    public static void main(String[] args) {
        String nom, posi;
        int i = 1, numJuga; 
        double edad, esta, sumaEdad = 0, sumaEstatura = 0, proEdad, proEsta;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de jugadores: ");
        numJuga = teclado.nextInt();
        while (i <= numJuga) {
            System.out.print("Ingrese el nombre del jugador: ");
            nom = teclado.next();
            System.out.print("Ingrese la posicion del jugador (Delantero, Arquero, Mediocentro, Defensa): ");
            posi = teclado.next();
            System.out.print("Ingrese la estatura del jugador: ");
            esta = teclado.nextDouble();
            System.out.print("Ingrese la edad del jugador: ");
            edad = teclado.nextInt();
            if (i == 1){
                System.out.println("Listado de jugadores");
            }
            System.out.println(i + " - " + posi + " - " + nom + " edad " + edad + " estatura " + esta);
            sumaEdad += edad;
            sumaEstatura += esta;
            i++;         
        }
        proEdad = sumaEdad / numJuga;
        proEsta = sumaEstatura / numJuga;
        System.out.println("Promedio de edades: " + proEdad);
        System.out.println("Promedio de estuturas: " + proEsta);
    }
}
/***
 * run:
 * Ingrese la cantidad de jugadores: 2
 * Ingrese el nombre del jugador: Diego
 * Ingrese la posicion del jugador (Delantero, Arquero, Mediocentro, Defensa): Defensa
 * Ingrese la estatura del jugador: 1,75
 * Ingrese la edad del jugador: 25
 * Listado de jugadores
 * 1 - Defensa - Diego edad 25.0 estatura 1.75
 * Ingrese el nombre del jugador: Paul
 * Ingrese la posicion del jugador (Delantero, Arquero, Mediocentro, Defensa): Arquero
 * Ingrese la estatura del jugador: 1,68
 * Ingrese la edad del jugador: 28
 * 2 - Arquero - Paul edad 28.0 estatura 1.68
 * Promedio de edades: 26.5
 * Promedio de estuturas: 1.71
 */