/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package SistemaParabrisas;

/**
 *
 * @author samue
 */
public enum Velocidades {
    BAJA("Baja"),
    MEDIA("Media"),
    ALTA("Alta");
    
    private final String velocidadparabrisas;

    public String getVelocidad() {
        return velocidadparabrisas;
    }

    private Velocidades(String velocidadparabrisas) {
        this.velocidadparabrisas = velocidadparabrisas;
    }
         
}
