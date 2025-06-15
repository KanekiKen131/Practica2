/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import controller.Utilidades;

/**
 *
 * @author alexa
 */
public class Ejercicio {

    public static void main(String[] args) {
        int dia = 1;
        String msg = " ";
        switch (dia) {
            case 1:
                msg = "Lunes, mal dia";
                break;
            case 2:
                msg = "Martes, buen dia";
                break;
            case 3:
                msg = "Miercoles, mal dia";
                break;
            case 4:
                msg = "Jueves, buen dia";
                break;
            case 5:
                msg = "Viernes, mal dia";
                break;
            default:
                msg = "descanso";
        }
        System.out.println(msg);
    }
}
