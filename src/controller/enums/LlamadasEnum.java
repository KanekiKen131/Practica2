/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.enums;

/**
 *
 * @author alexa
 */
public enum LlamadasEnum {
    AMERICADEL_NORTE("America del norte", 12, 2.75f), AMERICA_CENTRAL("America central", 15, 1.89f),
    AMERICADEL_SUR("America del sut", 18, 1.6f),
    EUROPA("Eupopa", 19, 3.5f), ASIA("Asia", 23, 4.5f),
    AFRICA("Africa", 25, 3.1f), OCEANIA("Oceania", 29, 3.0f),
    RESTODEL_MUNDO("Resto del mundo", 31, 6.0f);
    private Integer clave;
    private String name;
    private Float precio;

    private LlamadasEnum(String name, Integer clave , Float precio) {
        this.name = name;
        this.clave = clave;
        this.precio = precio;
    }

    public Integer getClave() {
        return clave;
    }

    public String getName() {
        return name;
    }

    public Float getPrecio() {
        return precio;
    }
    
}
   