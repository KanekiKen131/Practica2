/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import controller.Utilidades;
import controller.enums.PrestamoEnum;
import java.util.Random;
import java.util.Scanner;
import controller.practic2.Practica2;

/**
 *
 * @author alexa
 */
public class MainPractica2 {

    private static final Scanner sc = new Scanner(System.in);
    private static int num;

    public static void main(String[] args) {
        Practica2 p = new Practica2();
        Utilidades u = new Utilidades();
        Random random = new Random();
        System.out.println("1: Control de acceso a un edificio inteligente ");
        System.out.println("2: Simulación de préstamo bancario");
        System.out.println("3: Optimización de riego en cultivo");
        System.out.println("4: Llamadas telefónicas");
        System.out.println("5: Gestión de préstamos en biblioteca");
        System.out.println("0: Salir");
        int option = sc.nextInt();

        do {
            switch (option) {
                case 1: {
                    System.out.println("Acceso a un edificio inteligente ");
                    p.accesoEmpresa();
                     break;
                }
                case 2: {
                    System.out.println("Simulacion de prestamo bancario ");
                    Integer opcion = 2;
                    if (Practica2.AMORTIZACION_ANUAL == opcion) {
                        System.out.println("La amortizacion anual es " + p.calAmortizacionAnual(1400.0f,
                                PrestamoEnum.TIPO_PERSONAL.getInteres(), 5f));

                    } else if (Practica2.CUOTA_MENSUAL == opcion) {
                        System.out.println("La cuota mensual es " + p.calAmortizacionAnual(1000.0f,
                                PrestamoEnum.TIPO_PERSONAL.getInteres(), 5f));
                    }
                    break;
                }

                case 3: {
                    System.out.println("Datos para un riego de cultivo");
                    System.out.println("Ingrese numero de la parcela: ");
                    int parcelas = sc.nextInt();
                    int totalDiario = 0;
                    for (int i = 1; i <= parcelas; i++) {
                        totalDiario += p.riegoCultivo(parcelas); }
                    System.out.println("Tiempo total de riego en todas las parcelas: " + totalDiario + " horas");
                    break;
                }

                case 4: {
                    System.out.println("Calculador de costo de llamadas telefonicas ");
                    Float costo = p.llamadasTelefonicas(5, 31);
                    if (costo > 0) {
                        System.out.println("Tiene que pagar " + costo + " dolares");
                    } else {
                        System.out.println("Ingrese el numero de pais correcto ");
                    }

                    break;
                }
                case 5: {
                    System.out.println("Gestion de multa ");    
                    p.prestamoBibliotecario();

                }
            }
            System.out.println("Desea salir precione 0 caso contrario cualquier numero del menu");
            option = sc.nextInt();
        } while (option != 0);
    }
}
