/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.enums;

/**
 *
 * @author alexa
 */
public enum PrestamoEnum { 
    
    TIPO_PERSONAL(5.5f), HIPOTECARIO(4.5f), COFIDIS(4.0f);
    private Float interes;
    private PrestamoEnum (Float interes){
        this.interes = interes;
        
    }

    public Float getInteres() {
        return interes;
    }
}
