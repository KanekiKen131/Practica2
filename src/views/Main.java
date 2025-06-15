/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import controller.Utilidades;
import controller.fors.Fors;
import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class Main {

    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Fors f = new Fors();
        System.out.println("1: Secuencia de collatz");
        System.out.println("2: Factorial");
        System.out.println("3: Reloj Digital");
        System.out.println("4: Mostrar todos los números de 1 a 100 que no sean divisibles por 3 ni por 5.");
        System.out.println("0: Salir");
        int option = sc.nextInt();

        do {
            switch (option) {
                case 1: {
                    System.out.println("Secuencia de collatz ");
                    System.out.println("Ingrese el numero:");
                    int num = sc.nextInt();
                    f.Collatz(num);
                    break;
                }
                case 2: {
                    System.out.println("Factorial de un numero ");
                    System.out.println("Ingrese el primer numero: ");
                    int numI = sc.nextInt();
                    System.out.println("Ingrese el ultimo numero: ");
                    int numF = sc.nextInt();
                    f.Factorial(numI, numF);
                    break;

                }
                case 3: {
                    System.out.println("Inicio del reloj digital: ");
                    f.RelojDigital();
                    break;
                }
                case 4: {
                    System.out.println("Numeros diivisbles ");
                    f.numerosDivisibles();
                    break;
                }

            }
            System.out.println("Desea salir precione 0 caso contrario cualquier numero del menu");
            option = sc.nextInt();
        } while (option != 0);
    }
}
