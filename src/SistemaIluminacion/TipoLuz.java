/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package SistemaIluminacion;
import java.awt.Color;
/**
 *
 * @author samue
 */

public enum TipoLuz {
    DELANTERA_BAJA(Color.WHITE),
    DELANTERA_ALTA(Color.WHITE),
    INTERMITENTE(Color.ORANGE),
    EMERGENCIA(Color.ORANGE),
    PUERTAS(Color.BLUE);

    private final Color color;
    
     public Color getColor() {
        return color;
    }

    TipoLuz(Color color) {
        this.color = color;
    }

   
}

