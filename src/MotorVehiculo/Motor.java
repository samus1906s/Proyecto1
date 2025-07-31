/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MotorVehiculo;

import SistemaRadio.SistemaRadio;
import AcelerarVehiculo.Acelerar;
/**
 *
 * @author je110
 */
public class Motor {
    
    private boolean state;
    private SistemaRadio radio;
    private Acelerar acelerador;

    public boolean isState() {
        return state;
    }

    public SistemaRadio getRadio() {
        return radio;
    }
    
    public Motor() {
        this.state = false;
        this.radio = new SistemaRadio();
        this.acelerador = new Acelerar();
    }
    
    public void MotorOn(){
    this.state = true;
    radio.encender();
    }
    
    public void MotorOff(){
    this.state = false;
    radio.apagar();
    }
}
