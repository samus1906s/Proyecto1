/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlarmaVehiculo;
import VehiculoPuertas.Puerta;
/**
 *
 * @author je110
 */
public class Alarma {
    private boolean stateAlarm;
    private Puerta door;

    public boolean isStateAlarm() {
        return stateAlarm;
    }

    public Alarma(Puerta door) {
        this.stateAlarm = false;
        this.door = door;
    }
    
    public void activateAlarm(){
        this.stateAlarm = true;
    }
    
    public void desactivateAlarm(){
        this.stateAlarm = false;
    }
    
    public void unlockAlarm(){
        if (!stateAlarm){
            door.abrir();
        }
    }
    
    public void lockAlarm(){
        if (stateAlarm){
            door.cerrar();
        }
    }
}
