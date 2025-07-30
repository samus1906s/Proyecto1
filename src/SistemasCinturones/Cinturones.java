/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemasCinturones;

import AlarmaVehiculo.Alarma;
import MotorVehiculo.Motor;

/**
 *
 * @author Eduard Salas Murillo
 */
public class Cinturones {
    private boolean conductorCinturonPuesto;
    private boolean pasajeroCinturonPuesto;
    private Motor motor; 
    private Alarma alarma; 

    private static final int TIEMPO_ALERTA_CINTURON_SEGS = 5; 

    public Cinturones(Motor motor, Alarma alarma) {
        this.conductorCinturonPuesto = false;
        this.pasajeroCinturonPuesto = false;
        this.motor = motor;
        this.alarma = alarma;
    }

    public void ponerCinturonConductor() {
        if (!conductorCinturonPuesto) {
            conductorCinturonPuesto = true;
        }
        
    }

    public void quitarCinturonConductor() {
        if (conductorCinturonPuesto) {
            conductorCinturonPuesto = false;
        }
    }

    public void ponerCinturonPasajero() {
        if (!pasajeroCinturonPuesto) {
            pasajeroCinturonPuesto = true;
        }
    }

    public void quitarCinturonPasajero() {
        if (pasajeroCinturonPuesto) {
            pasajeroCinturonPuesto = false;
        }
    }

    public boolean ConductorCinturonPuesto() {
        return conductorCinturonPuesto;
    }

    public boolean PasajeroCinturonPuesto() {
        return pasajeroCinturonPuesto;
    }

    // Método para verificar los cinturones al encender el vehículo o durante la conducción
    public void verificarCinturones() {
        if (motor.isState()) { 
            if (!ConductorCinturonPuesto() || !PasajeroCinturonPuesto()) { 
                new Thread(() -> {
                    try {
                        Thread.sleep(TIEMPO_ALERTA_CINTURON_SEGS * 1000);
                        if (motor.isState() && (!ConductorCinturonPuesto() || !PasajeroCinturonPuesto())) { 
                            alarma.activateAlarm(); 
                        } else {
                            if (alarma.isStateAlarm()) { 
                                alarma.desactivateAlarm();
                            }
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt(); 
                    }
                }).start();
            } else {
                if (alarma.isStateAlarm()) { 
                    alarma.desactivateAlarm();
                }
            }
        } else {
            if (alarma.isStateAlarm()) { 
                alarma.desactivateAlarm(); 
        }
    }
}
}
