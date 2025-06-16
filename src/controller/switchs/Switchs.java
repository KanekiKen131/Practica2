/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.switchs;

import controller.Utilidades;
import java.util.Random;
import java.util.Scanner;

/**
 * Juego de piedra-papel-tijera con opción para reiniciar.
 *
 * @author alexa
 */
public class Switchs {
    private static final Scanner sc = new Scanner(System.in);

    public void juegoP_P_T(int select) {
        Random random = new Random();
        int eleccionComputadora = random.nextInt(3); // 1 a 3
        System.out.println("Computadora eligió: " + Utilidades.opcionAString(eleccionComputadora));
        switch (select) {
            case 1: {
                // el usuario eligió Piedra
                switch (eleccionComputadora) {
                    case 1:
                        System.out.println("Empate!");
                        break;
                    case 2:
                        System.out.println("Gana la computadora: Papel envuelve a Piedra.");
                        break;
                    case 3:
                        System.out.println("Ganas tú: Piedra rompe Tijera.");
                        break;
                }
                break;
            }
            case 2: {
                // el usuario eligió Papel
                switch (eleccionComputadora) {
                    case 1:
                        System.out.println("Ganas tú: Papel envuelve a Piedra.");
                        break;
                    case 2:
                        System.out.println("Empate!");
                        break;
                    case 3:
                        System.out.println("Gana la computadora: Tijera corta Papel.");
                        break;
                }
                break;
            }
            case 3: {
                // el usuario eligió Tijera
                switch (eleccionComputadora) {
                    case 1:
                        System.out.println("Gana la computadora: Piedra rompe Tijera.");
                        break;
                    case 2:
                        System.out.println("Ganas tú: Tijera corta Papel.");
                        break;
                    case 3:
                        System.out.println("Empatados");
                        break;
                }
                break;
            }
            default:
                System.out.println("Opción inválida.");
        }
        System.out.println("Juego terminado...");
    }
/**
 * Conversor de monedas (USD, EUR, MXN, etc.
 * @param valor
 * @return 
 */
    public String convertirMonedas(double valor) {
        double resultado = 0.0;
        String monedaDestino = " ";
        System.out.println("Seleccione la moneda a la que desea convertir:");
        System.out.println("1. EUR (Euro)");
        System.out.println("2. MXN (Peso Mexicano)");
        System.out.println("3. GBP (Libra Esterlina)");
        System.out.println("4. JPY (Yen Japonés)");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                resultado = valor * 0.85; // EUR
                monedaDestino = "EUR";
                break;
            case 2:
                resultado = valor * 20.0; // MXN
                monedaDestino = "MXN";
                break;
            case 3:
                resultado = valor * 0.75; // GBP
                monedaDestino = "GBP";
                break;
            case 4:
                resultado = valor * 110.0; // JPY
                monedaDestino = "JPY";
                break;
            default:
                System.out.println("Opción inválida.");
                return "Opción inválida";
        }
        System.out.printf("%.2f USD equivalen a %.2f %s%n", valor, resultado, monedaDestino);
        return monedaDestino;
    }

    /**
     *Clasificación de IMC según valor ingresado.
     * @param altura
     * @param peso
     * @return
     */
    public String clasificacionIMC(double altura, double peso) {
    double imc = peso / (altura * altura);
    int categoria;

    if (imc < 18.5) {
        categoria = 0; // bajo peso
    } else if (imc < 25) {
        categoria = 1; // normal
    } else if (imc < 30) {
        categoria = 2; // sobrepeso
    } else {
        categoria = 3; // obesidad
    }

    String resp;
    switch (categoria) {
        case 0:
            resp = "Bajo peso";
            break;
        case 1:
            resp = "Peso normal";
            break;
        case 2:
            resp = "Sobrepeso";
            break;
        case 3:
            resp = "Obesidad";
            break;
        default:
            resp = "Clasificación desconocida";
            break;
    }

    System.out.printf("IMC: %.2f", imc, resp);
    
    return resp;
}
    /**
     * Detectar si un carácter es vocal, consonante o símbolo.
     *
     * @param a
     */
    public void detectarCharacter(char palabra) {
        palabra = Character.toLowerCase(palabra);
        switch (palabra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vocal ");
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                System.out.println("Consonante ");
                break;
            case '-':
            case '.':
            case ',':
            case '@':
            case '!':
                System.out.println("Simbolo ");
                break;
            default:
                System.out.println("Carácter no reconocido ");
                throw new AssertionError();
        }

    }

}
