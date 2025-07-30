/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaClimatizacion;

import MotorVehiculo.Motor;

/**
 *
 * @author Eduard Salas Murillo
 */
public class Climatizacion {
    private boolean acEncendido;
    private int temperatura; 
    private int velocidadVentilador; 
    private Motor motor; 
    
    public int getVelocidadVentilador() {
        return velocidadVentilador;
    }
    
    public int getTemperatura() {
        return temperatura;
    }
    
    public void setTemperatura(int nuevaTemperatura) {
        if (acEncendido) {
            if (nuevaTemperatura >= 18 && nuevaTemperatura <= 30) { // Rango razonable
                this.temperatura = nuevaTemperatura;
            }
        }
    }

    public void setVelocidadVentilador(int velocidad) {
        if (motor.isState()) { 
            if (velocidad >= 0 && velocidad <= 3) {
                this.velocidadVentilador = velocidad;
            }
        }
    }

    public Climatizacion(Motor motor) {
        this.acEncendido = false;
        this.temperatura = 22; 
        this.velocidadVentilador = 0;
        this.motor = motor;
    }

    public void encenderAC() {
        if (motor.isState()) {
            if (!acEncendido) {
                acEncendido = true;
            }
        }
    }

    public void apagarAC() {
        if (acEncendido) {
            acEncendido = false;
        }
    }

    public boolean AcEncendido() {
        return acEncendido;
    }

}
