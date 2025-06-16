/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.fors;

import controller.Utilidades;

/**
 *
 * @author alexa
 */
public class Fors {
/**
 * Secuencia de collatz
 * @param num 
 */
    public void Collatz(int num) {
        
        for (int i = 0; i <= num; i++) {
            System.out.print(num + " -> ");

            if (num % 2 == 0) {
                num = num / 2; // si es par
            } else {
                num = 3 * num + 1; // si es impar
            }
        }

        System.out.println(1);
        System.out.println("Programa finalizado.. ");
    }
/**
 * Factorial
 * @param numI
 * @param numF 
 */
    public void Factorial(int numI, int numF) {
        Utilidades u = new Utilidades();
        System.out.println("\nFactoriales en el rango de " + numI + " a " + numF + ":");
        for (int i = numI; i <= numF; i++) {
            System.out.println("El factorial es: " + u.calcularFactorial(i));
        }
      
    }
/**
 * Reloj Digital
 */
    public void RelojDigital() {

        for (int horas = 0; horas <= 23; horas++) {
            for (int minutos = 0; minutos <= 59; minutos++) {
                for (int segundos = 0; segundos <= 59; segundos++) {
                    String horasformat = String.format("%02d", horas);
                    String minutosformat = String.format("%02d", minutos);
                    String segundosformat = String.format("%02d", segundos);
                    // se muestra la hora en formato hora:minuto:segundo 
                    System.out.println(horasformat + ":" + minutosformat + ":" + segundosformat);
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        System.out.println("Finalizando reloj...");
    }
/**
 * Mostrar todos los números de 1 a 100 que no sean divisibles por 3 ni por 5
 */
    public void numerosDivisibles() {
        for (int canicas = 1; canicas <= 100; canicas++){
            if (canicas % 3 != 0 && canicas % 5 != 0){
                System.out.println(canicas + " ");
            }
        }
        System.out.println("Se consiguio mostrar el resultado \nsaliendo del programa...");

    }

}
