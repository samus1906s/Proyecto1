/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package CombustibleVehiculo;

import java.awt.Color;

/**
 *
 * @author je110
 */
public enum TipoCombustible {
    
    GASOLINA("Gasolina"), HIBRIDO("Hibrido"), DIESEL("Diesel"), ELECTRICO("Electrico");
    
    private String fuelType;

    public String getFuelType() {
        return fuelType;
    }

    private TipoCombustible(String fuelType) {
        this.fuelType = fuelType;
    }
    
}
