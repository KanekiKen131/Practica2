/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.dowhiles;

import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class Dowhiles {
     private static final Scanner sc = new Scanner(System.in);
    /**
     * Ingresar letras hasta que se repita una vocal
     * @param s 
     */
    public void ingresarLetra (){
        
        char a = ' ';
        do {  
            System.out.println("Ingresa una letra: ");
            String aux = sc.next();
            a = aux.toLowerCase().charAt(0);
            System.out.println("Se ha ingresado "+a);
        } while (a != 'a' );
            
        System.out.println("Se ha finalizado el metodo letras y vocales");
    }
     /**
      * Generar un menú que se repita hasta que se elija "salir".
      * @param sc 
      */
    public void mostrarMenu() {
        String opcion;
        do {
            System.out.println("\n Menú:");
            System.out.println("1. Ver mensaje");
            System.out.println("2. Realizar cálculo");
            System.out.println("3. Realizar segundo calculo");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    System.out.println("Bienvenido al increible mundo de gumball: ");
                    break;
                case "2":
                    System.out.println("El resultado de 104 * 3 es: " + (104 * 3));
                    break;
                case "3":
                    System.out.println("El resultado de 34 + 31 es: "+ (34 + 31));
                    break;
                case "4":
                    System.out.println("Bye bye ");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (!opcion.equals("4"));
        System.out.println("Finalizando.. ");
        
}
    /**
     * leer edades y determinar la cantidad de mayores de edad
     * @param s 
     */
    public void determinarEdades (){
        int cantidad = 0;
        int edad;
        System.out.println("Ingrese las edades: ");
        do {  
            edad = sc.nextInt();
            if (edad >= 18){
                cantidad++;
                
            }
        } while (edad >= 0);
        System.out.println("Cantidad de mayores de edad "+cantidad);   
        System.out.println("Programa terminado...");
    }
    /**
     * Validar datos numéricos hasta cumplir con un rango.
     * @return 
     */
    public static int solicitarNumero() {
        int numero;
        do {
            System.out.print("Ingrese cualquier numero: ");
            numero = sc.nextInt();
            
            if (numero < 1 || numero > 100) {
                System.out.println("Número fuera de rango. Intente de nuevo.");
            }
            else if (numero > 1 || numero <100){
                System.out.println("Numero dentro del rango. \nAccediendo..");
            }
        } while (numero < 1 || numero > 100);
         
        return numero;
    }
    
}
