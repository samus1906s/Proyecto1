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

    public boolean isState() {
        return state;
    }

    public Motor(boolean state) {
        this.state = false;
    }
    
    public void MotorOn(){
    this.state = true;
    }
    
    public void MotorOff(){
    this.state = false;
    }
}
