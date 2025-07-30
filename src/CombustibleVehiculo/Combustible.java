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
    
    private double fuelLevel, capacityTank;

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getCapacityTank() {
        return capacityTank;
    }

    public void setFuelLevel(double fuelLevel) {
        if (fuelLevel >= 0 && fuelLevel <= capacityTank){
        this.fuelLevel = fuelLevel;
        }
    }

    public void setCapacityTank(double capacityTank) {
        this.capacityTank = capacityTank;
    }

    public Combustible(double fuelLevel) {
        this.capacityTank = 15.6; 
        this.setFuelLevel(fuelLevel);
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
    
     public void fuelConsume(double distanciaKm, int rpm) {
        if (distanciaKm <= 0 || rpm < 0) return;

        double consumoBase = 0.1; 
        double factorRPM = 1 + (rpm / 10000.0); 
        double consumo = distanciaKm * consumoBase * factorRPM;

        fuelLevel -= consumo;

        if (fuelLevel < 0) {
            fuelLevel = 0;
        }
    }
}

