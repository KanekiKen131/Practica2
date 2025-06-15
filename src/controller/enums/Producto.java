/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.enums;
import java.time.LocalDate;
/**
 *
 * @author alexa
 */
public enum Producto {
    VIGENTE(), PROXIMO(), CADUCADO();
    String dias;
    LocalDate caducidad;

    public static Producto getVIGENTE() {
        return VIGENTE;
    }

    public static Producto getPROXIMO() {
        return PROXIMO;
    }

    public static Producto getCADUCADO() {
        return CADUCADO;
    }

    public String getDias() {
        return dias;
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

}  

