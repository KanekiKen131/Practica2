/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.practic2;

import java.util.Scanner;
import controller.enums.LlamadasEnum;
import controller.enums.PrestamoEnum;
import java.util.Random;

/**
 *
 * @author alexa
 */
public class Practica2 {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * Control de acceso a un edificio inteligente
     */
    public void accesoEmpresa() {

        String userCorrect = "elpepe131";
        String contraCorrect = "1234";
        int intentos = 0;
        boolean permisoConcedido = false;
        System.out.println("Acceso a la Empresa ");

        while (intentos < 3 && !permisoConcedido) {
            System.out.println("Ingrese su usuario: ");
            String user = sc.nextLine();

            System.out.println("Ingrese su contra: ");
            String contra = sc.nextLine();

            if (user.equals(userCorrect) && contra.equals(contraCorrect)) {
                System.out.println("Ha podido ingresar con exito: ");
                permisoConcedido = true;
                System.out.println("Elija entre (1.Visitante, 2.Empleado, 3.Administrador): ");
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Le damos la bienvenidad VISITANTE. ");
                        break;
                    case 2:
                        System.out.println("Le damos la bienvenidad EMPLEADO. ");
                        break;
                    case 3:
                        System.out.println("Le damos la bienvenidad ADMINISTRADOR. ");
                        break;
                }
            } else {
                intentos = intentos + 1;
                System.out.println("Se ha presentado un error. \nIntentos restante: " + (3 - intentos) + "intentos");
            }
        }
        if (!permisoConcedido) {
            System.out.println("Se alcanzo el limite de intetos...");
        }
        System.out.println("Ha terminado el registro....");
    }
    /**
     * Simulación de préstamo bancario
     */
    public static Integer CUOTA_MENSUAL = 1;
    public static Integer AMORTIZACION_ANUAL = 2;

    public Float calCuotaMensual(Float monto, Float interes, Float anios) {
        Float resp = 0.0f;
        Float interesMensual = interes / 12;
        Float descuento = (float) Math.pow(1 + interes, -anios * 12);
        resp = (monto * interesMensual) / (1 - descuento);
        return resp;
    }

    public Float calAmortizacionAnual(Float monto, Float interes, Float anios) {
        Float resp = 0.0f;
        Float cuotaMensual = calCuotaMensual(monto, interes, anios);
        resp = cuotaMensual * 12;
        return resp;
    }

    public Float calCuotaAmortizacion(Float monto, PrestamoEnum interes_enum, Float anios, Integer tipo) {
        Float resp = 0.0f;

        switch (tipo) {
            case 0:
                return calCuotaMensual(monto, interes_enum.getInteres(), anios);

            case 1:
                return calAmortizacionAnual(monto, interes_enum.getInteres(), anios);
            default:
                break;
        }

        return resp;

    }
    /**
     * Optimización de riego en cultivo
     */
    private static final int LECTURAS_DIARIAS = 6;
    private static final int TIEMPO_RIEGO_POR_LECTURA = 4;
    private Random random = new Random();

    public int riegoCultivo(int parcela) {
        int timeRiego = 0;
        System.out.println("Parcela " + parcela + ":");
        for (int hora = 0; hora <= LECTURAS_DIARIAS; hora++) {
            int humedad = random.nextInt(100);
            if (humedad <= 30) {
                timeRiego += TIEMPO_RIEGO_POR_LECTURA;
                System.out.println("Hora " + (hora * 2) + ": Humedad = " + humedad + "% -> RIEGO ENCENDIDO");
            } else if (humedad <= 60) {
                System.out.println("  Hora " + (hora * 2) + ": Humedad = " + humedad + "% -> RIEGO MANTENIDO");
            } else {
                System.out.println("  Hora " + (hora * 2) + ": Humedad = " + humedad + "% -> RIEGO APAGADO");
            }
        }
        System.out.println("Tiempo total de riego: " + timeRiego + " horas\n");
        return timeRiego;
    }

    /**
     * Llamadas telefónicas
     *
     * @param minuto
     * @param clave
     * @return
     */
    public Float llamadasTelefonicas(Integer minuto, Integer clave) {
        Float precio = 0.0f;
        LlamadasEnum data = null;
        for (LlamadasEnum aux : LlamadasEnum.values()) {
            if (clave == aux.getClave()) {
                data = aux;
                break;
            }
        }
        if (data != null) {
            precio = data.getPrecio() * minuto;
            return precio;
        }
        System.out.println("Ha cumlminado el programa....");
        return precio;
    }

    /**
     * Gestión de préstamos en biblioteca
     */
    public void prestamoBibliotecario() {
        System.out.println("Ingrese los dias ha devolver el libro: ");
        int diasAtrasados = sc.nextInt();
        if (diasAtrasados > 30) {
            double multa = diasAtrasados * 0.50;
            System.out.println("El libro tiene " + diasAtrasados + "dias de retraso: ");
            System.out.println("Se le impone una multa de: " + multa+ "$");
        } else if (diasAtrasados < 30) {
            System.out.println("Grandioso ha entregado el libro a tiempo ");

        }
        System.out.println("Ha termina el programa...");
    }

}
