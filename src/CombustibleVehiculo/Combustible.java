/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CombustibleVehiculo;

/**
 *
 * @author je110
 */
public class Combustible {
    
    private TipoCombustible type;
    private double fuelLevel, capacityTank;

    public TipoCombustible getType() {
        return type;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getCapacityTank() {
        return capacityTank;
    }

    public void setFuelLevel(double fuelLevel) {
        if (fuelLevel >= 0){
        this.fuelLevel = fuelLevel;
        }
    }

    public void setCapacityTank(double capacityTank) {
<<<<<<< HEAD
        this.capacityTank = capacityTank; 
=======
        this.capacityTank = capacityTank;
>>>>>>> 2a55e6a (Clase combustible y Enum)
    }

    public Combustible(TipoCombustible type, double fuelLevel) {
        this.type = type;
        this.fuelLevel = fuelLevel;
        this.capacityTank = 15.6; 
    }
    
    public double fuelPercentage(){
        return (fuelLevel / capacityTank) * 100;
    }
    
    public void fuelRecharge(double liters){
        this.fuelLevel += liters;
        if (this.fuelLevel > capacityTank){
            this.fuelLevel = capacityTank;
        }
    }
    
}
