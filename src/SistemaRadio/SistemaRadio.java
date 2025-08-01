/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaRadio;
import SistemaRadio.ModoRadio;
/**
 *
 * @author Valdelomaar
 */
public class SistemaRadio {
    public int volumen;
    private boolean encendida;
    private ModoRadio modo;
    private double estacionActual;

    // Rangos AM/FM
    public final double AM_MIN = 530;
    public final double AM_MAX = 1700;
    public final double AM_STEP = 10;

    public final double FM_MIN = 88.1;
    public final double FM_MAX = 107.9;
    public final double FM_STEP = 0.2;

    public SistemaRadio() {
        this.encendida = true;
        this.modo = ModoRadio.FM;
        this.estacionActual = FM_MIN;
    }

    public void encender() {
        encendida = true;
    }
    
    public void bajarVolumen() {
        if (volumen > 0) {
            volumen--;
        }
    }

    public int getVolumen() {
        return volumen;
    }

    
    
    public void subirVolumen() {
        if (volumen < 100) {
            volumen++;
        }
        
    
        
    

        
    }
    public void apagar() {
        encendida = false;
    }

    public void cambiarModo(ModoRadio FM) {
        if (!encendida) return;

        switch (modo) {
            case FM:
                modo = ModoRadio.AM;
                estacionActual = AM_MIN;
                break;
            case AM:
                modo = ModoRadio.BLUETOOTH;
                estacionActual = 0;
                break;
            case BLUETOOTH:
                modo = ModoRadio.FM;
                estacionActual = FM_MIN;
                break;
        }
    }

    public void subirEstacion() {
        if (!encendida) return;

        switch (modo) {
            case FM:
                estacionActual = (estacionActual + FM_STEP > FM_MAX)
                        ? FM_MIN
                        : Math.round((estacionActual + FM_STEP) * 10.0) / 10.0;
                break;
            case AM:
                estacionActual = (estacionActual + AM_STEP > AM_MAX)
                        ? AM_MIN
                        : estacionActual + AM_STEP;
                break;
            default:
                break;
        }
    }

    public void bajarEstacion() {
        if (!encendida) return;

        switch (modo) {
            case FM:
                estacionActual = (estacionActual - FM_STEP < FM_MIN)
                        ? FM_MAX
                        : Math.round((estacionActual - FM_STEP) * 10.0) / 10.0;
                break;
            case AM:
                estacionActual = (estacionActual - AM_STEP < AM_MIN)
                        ? AM_MAX
                        : estacionActual - AM_STEP;
                break;
            default:
                break;
        }
    }

    // Getters
    public boolean isEncendida() {
        return encendida;
    }

    public ModoRadio getModo() {
        return modo;
    }

    public double getEstacionActual() {
        return estacionActual;
    }

    public void setEstacionActual(double estacion) {
    if (modo == ModoRadio.FM && estacion >= FM_MIN && estacion <= FM_MAX) {
        this.estacionActual = estacion;
    } else if (modo == ModoRadio.AM && estacion >= AM_MIN && estacion <= AM_MAX) {
        this.estacionActual = estacion;
    }
}
    
    public String getEstadoGeneral() {
        if (!encendida) return "Radio apagada.";

        String estado = "Modo: " + modo.name();

        if (modo == ModoRadio.AM || modo == ModoRadio.FM) {
            estado += " | Estación: " + estacionActual;
        } else {
            estado += " | Modo Bluetooth activo";
        }

        return estado;
    }
}