/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlarmaVehiculo;
import VehiculoPuertas.Puerta;
import MotorVehiculo.Motor;
/**
 *
 * @author je110
 */
public class Alarma {
    private boolean stateAlarm;
    private Puerta door;
    private Motor car;

    public boolean isStateAlarm() {
        return stateAlarm;
    }

    public Alarma(Puerta door, Motor car) {
        this.stateAlarm = false;
        this.door = door;
        this.car = car;
    }
    
    public void activateAlarm(){
        this.stateAlarm = true;
    }
    
    public void desactivateAlarm(){
        this.stateAlarm = false;
    }
    
    public void unlockAlarm(){
       
        desactivateAlarm();
        door.abrir();
    }
    
    public void lockAlarm(){
        
        door.cerrar();
        activateAlarm();
    }
    
    public void openDoorWithAlarm(){
        if (stateAlarm && !door.estaAbierta()){
            door.cerrar();
        }
        door.abrir();
    }
    
    public void offCarAlarm(){
        if (stateAlarm){
            car.MotorOff();
        }else{
            car.MotorOn();
        }
    }
}
