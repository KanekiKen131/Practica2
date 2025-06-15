/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;


import controller.whiles.Whiles;
import java.util.Scanner;

/**
 *
 *
 * @author alexa
 */
public class MainWhiles {

    private static final Scanner sc = new Scanner(System.in);
    

    public static void main(String[] args) {

        Whiles w = new Whiles();
        
        System.out.println("1: Numero palindromos");
        System.out.println("2: Digitos de un numero");
        System.out.println("3: Temperaturas");
        System.out.println("4: Validar contraseña con tres intentos.");
        System.out.println("0: Salir");
        int option = sc.nextInt();

        do {
            switch (option) {
                case 1: {
                    System.out.println("Numeros palindromos ");
                    System.out.println("Ingrese el numero: ");
                    int num = sc.nextInt();
                    w.determinarNumPalindromo(num);
                    break;
                }
                case 2: {
                    System.out.println("Digitos de un numero ");
                    System.out.println("Ingrese el valor: ");
                    int valor = sc.nextInt();
                    w.contarDigito(valor);
                    break;
                }
                case 3: {
                    System.out.println("Temperaturas");
                    w.encontrarTemperatura();
                    break;
                }
                case 4: {
                    System.out.println("Contraseña de tres intentos ");
                    String[] intentos = new String[3];
                    sc.nextLine();
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Ingrese la contraseña (intento " + (i + 1) + "): ");
                        intentos[i] = sc.nextLine();
                    }
                    w.validarContrasenia("1234", intentos);
                    break;
                }
            }
            System.out.println("Desea salir precione 0 caso contrario cualquier numero del menu");
            option = sc.nextInt();
        } while (option != 0);
    }
}
