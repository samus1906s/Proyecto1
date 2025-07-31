/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MotorVehiculo;
/**
 *
 * @author je110
 */
public class Motor {
    
private boolean state;

    public Motor() {
        this.state = false;
    }

    public boolean isState() {
        return state;
    }

    public void encender() {
        this.state = true;
    }

    public void apagar() {
        this.state = false;
    }
}
