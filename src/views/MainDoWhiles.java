package views;

import controller.dowhiles.Dowhiles;
import controller.Utilidades;
import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class MainDoWhiles {

    private static final Scanner sc = new Scanner(System.in);
    private static int num;

    public static void main(String[] args) {
        Dowhiles d = new Dowhiles();
        Utilidades u = new Utilidades();
        System.out.println("1:Ingresar letras hasta que se repita una vocal. ");
        System.out.println("2:Generar un menú que se repita hasta que se elija salir.");
        System.out.println("3:Leer edades y determinar la cantidad de mayores de edad. ");
        System.out.println("4:Validar datos numéricos hasta cumplir con un rango. ");
        System.out.println("0:Salir");
        int option = sc.nextInt();
        do {
            switch (option) {
                case 1: {
                    System.out.println("Repeticion de una vocal ");
                    d.ingresarLetra();
                    break;
                }
                case 2: {
                    System.out.println("Bienvenido al Menu basico ");
                    d.mostrarMenu();
                    break;
                }
                case 3: {
                    System.out.println("Cantidad de mayores de edad ");
                    d.determinarEdades();
                    break;
                }
                case 4: {
                    System.out.println("Validacion de datos numericos ");
                    d.solicitarNumero();

                    break;
                }

            }
            System.out.println("Desea salir precione 0 caso contrario cualquier numero del menu");
            option = sc.nextInt();
        } while (option != 0);
    }
}
