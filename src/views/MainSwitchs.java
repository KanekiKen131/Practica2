/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import controller.Utilidades;
import controller.switchs.Switchs;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author alexa
 */
public class MainSwitchs {

    private static final Scanner sc = new Scanner(System.in);
    private static int num;

    public static void main(String[] args) {
        Switchs s = new Switchs();
        Random random = new Random();

        System.out.println("1:Juego de piedra papel tijera ");
        System.out.println("2:Conversor de monedas (USD, EUR, MXN, etc.)");
        System.out.println("3:Clasificación de IMC según valor ingresado. ");
        System.out.println("4:Detectar si un carácter es vocal, consonante o símbolo.");
        System.out.println("0: Salir");
        int option = sc.nextInt();

        do {
            switch (option) {
                case 1: {
                    System.out.println("Bienvenido al grandioso juego piedra papel y tijera");
                    System.out.println("Elige una opción:");
                    System.out.println("1: Piedra");
                    System.out.println("2: Papel");
                    System.out.println("3: Tijera");
                    System.out.print("Tu elección: ");
                    int eleccionUsuario = sc.nextInt();
                    s.juegoP_P_T(eleccionUsuario);
                }
                break;
                case 2: {
                    System.out.println("Conversor de monedas");
                    System.out.print("Ingrese la cantidad en USD: ");
                    double cantidad = sc.nextDouble();
                    s.convertirMonedas(cantidad);
                    System.out.println("Seleccione la moneda a la que desea convertir:");
                    System.out.println("1 - EUR (Euro)");
                    System.out.println("2 - MXN (Peso mexicano)");
                    System.out.println("3 - GBP (Libra esterlina)");
                    System.out.println("4 - JPY (Yen japonés)");
                    System.out.print("Opción: ");
                    int opcion = sc.nextInt();
                    s.convertirMonedas(opcion);
                }
                break;
                case 3: {
                    System.out.println("Calculadora y clasificación de IMC");
                    System.out.print("Ingrese el peso en kilogramos: ");
                    double peso = sc.nextDouble();

                    System.out.print("Ingrese la altura en metros: ");
                    double altura = sc.nextDouble();

                    String resultado = s.clasificacionIMC(altura, peso);
                    System.out.println("\nClasificación: " + resultado);
                }
                break;
                case 4: {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Detectar vocal, consonante o símbolo");
                    System.out.println("Ingrese cualquier carácter: ");
                    String input = sc.nextLine();
                    if (input.length() > 0) {
                        char c = input.charAt(0);
                        s.detectarCharacter(c);
                    } else {
                        System.out.println("Intentelo de nuevo.. ");
                    }
                }
                System.out.println("Desea salir precione 0 caso contrario cualquier numero del menu");
                option = sc.nextInt();
            }
        } while (option != 0);

    }

}
