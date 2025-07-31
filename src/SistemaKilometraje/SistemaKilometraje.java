

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaKilometraje;

import AcelerarVehiculo.Acelerar;
import CombustibleVehiculo.Combustible;
import MotorVehiculo.Motor;
/**
 *
 * @author Eduard Salas Murillo
 */
public class SistemaKilometraje {
    private double kilometrajeTotal;
    private double kilometrajeViaje; 
    private int velocidadActual; 
    private Acelerar rpm; 
    private Motor motor; 
    private Combustible combustible; 
    
    public double getKilometrajeTotal() {
        return kilometrajeTotal;
    }

    public double getKilometrajeViaje() {
        return kilometrajeViaje;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }
    
    public void setVelocidadActual(int velocidad) {
    if (velocidad >= 0) {
        this.velocidadActual = velocidad;
    }
}

    public SistemaKilometraje(Motor motor, Acelerar rpm) {
        this.kilometrajeTotal = 0.0;
        this.kilometrajeViaje = 0.0;
        this.velocidadActual = 0;
        this.rpm = rpm;
        this.motor = motor;
    }

   public void actualizarKilometraje(double distanciaRecorrida) {
    if (motor.isState()) {
        kilometrajeTotal += distanciaRecorrida;
        kilometrajeViaje += distanciaRecorrida;

        if (combustible != null && rpm != null) {
            combustible.fuelConsume(distanciaRecorrida, rpm.getRpm());
        }
    }
}

   public void resetearKilometrajeViaje() {
     kilometrajeViaje = 0.0;
    }
}
