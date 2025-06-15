/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.Random;

        
/**
 *
 * @author alexa
 */
public class Utilidades {
/**
 * Metodo para secuenia de collatz
 * @param num 
 */
    public void Collatz(int num) {
        int resp = 0;
        while (num != 1) {
            System.out.print(num + " -> ");
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = 3 * num + 1;
            }
        }

    }
/**
 * Metodo para factorial
 * @param num 
 */
    public static int calcularFactorial(int num) {
        int resultado = 1;
        for (int i = 2; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }
/**
 * metodo para rango del factorial
 * @param numI
 * @param numF 
 */
    public void Factorial(int numI, int numF) {
        // Validar el rango
        if (numI < 0 || numF < numI) {
            System.out.println("Rango inválido. Por favor, ingrese valores correctos.");
            return; // Salir del método si el rango es inválido
        }
    }
   /**
    * metodo para juego piedra, papel y tijera
    * @param opcion
    * @return 
    */
public static String opcionAString(int opcion) {
        switch (opcion) {
            case 1:
                return "Piedra";
            case 2:
                return "Papel";
            case 3:
                return "Tijera";
            default:
                return "Desconocido";
        }
    }
/**
 * metodo para convertir monedas
 * @param opcion
 * @return 
 */
public static double obtenerTasaCambio(int opcion) {
        switch (opcion) {
            case 1: // EUR
                return 0.85;
            case 2: // MXN
                return 20.0;
            case 3: // GBP
                return 0.75;
            case 4: // JPY
                return 110.0;
            default:
                return 0; // Opción inválida
        }
    }
/**
 * mtd. obtencion de monedas
 * @param opcion
 * @return 
 */
 public static String obtenerMonedaDestino(int opcion) {
        switch (opcion) {
            case 1: return "EUR";
            case 2: return "MXN";
            case 3: return "GBP";
            case 4: return "JPY";
            default: return " ";
        }
    }
 /**
  * metodo para clasificar imc
  * @param imc
  * @return 
  */
 public String clasificarIMC(double peso, double altura) {
    if (altura <= 0 || peso <= 0) {
        return "Datos inválidos";
    }

    double imc = peso / (altura * altura);
    int categoria;

    if (imc < 18.5)
        categoria = 0;
    else if (imc < 25)
        categoria = 1;
    else if (imc < 30)
        categoria = 2;
    else
        categoria = 3;

    switch (categoria) {
        case 0:
            return "Bajo peso";
        case 1:
            return "Peso normal";
        case 2:
            return "Sobrepeso";
        case 3:
            return "Obesidad";
        default:
            return "Desconocido";
    }
 
    }
 /**
  * metodo para calcular el imc
  * @param pesoKg
  * @param alturaM
  * @return 
  */
 public static double calcularIMC(double pesoKg, double alturaM) {
        return pesoKg / (alturaM * alturaM);
    }
 /**
  * metodo para temperatura
  * @param temp 
  */
 public void encontrarTemperatura(double temp) {
    if (temp < 0) {
        System.out.println("Temperatura menor a cero detectada.");
    } else {
        System.out.println("La temperatura no es menor a cero.");
    }
}
 /**
  * Metodo aumento de edad
  * @param edad 
  */
  public static void aumentarEdad(int edad) {
        edad = edad + 2;
        System.out.println("Dentro del método: " + edad);
    }
   
}
