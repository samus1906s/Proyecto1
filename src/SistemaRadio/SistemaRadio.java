/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaRadio;

/**
 *
 * @author Valdelomaar
 */
public class SistemaRadio {
    private boolean encendida;
    private String modo; // "AM", "FM", "Bluetooth"
    private double estacionActual;
    private String dispositivoBluetooth;
    private boolean bluetoothConectado;

    // Rangos
    private final double AM_MIN = 530;
    private final double AM_MAX = 1700;
    private final double AM_STEP = 10;

    private final double FM_MIN = 88.1;
    private final double FM_MAX = 107.9;
    private final double FM_STEP = 0.2;

    public SistemaRadio() {
        this.encendida = false;
        this.modo = "FM";
        this.estacionActual = FM_MIN;
        this.dispositivoBluetooth = "";
        this.bluetoothConectado = false;
    }

    public void encender() {
        encendida = true;
    }

    public void apagar() {
        encendida = false;
        bluetoothConectado = false;
        dispositivoBluetooth = "";
    }

    public void cambiarModo() {
        if (!encendida) return;

        switch (modo) {
            case "FM":
                modo = "AM";
                estacionActual = AM_MIN;
                break;
            case "AM":
                modo = "Bluetooth";
                estacionActual = 0;
                break;
            case "Bluetooth":
                modo = "FM";
                estacionActual = FM_MIN;
                bluetoothConectado = false;
                dispositivoBluetooth = "";
                break;
        }
    }

    public void subirEstacion() {
        if (!encendida) return;

        if (modo.equals("FM")) {
            estacionActual = (estacionActual + FM_STEP > FM_MAX) ? FM_MIN : Math.round((estacionActual + FM_STEP) * 10.0) / 10.0;
        } else if (modo.equals("AM")) {
            estacionActual = (estacionActual + AM_STEP > AM_MAX) ? AM_MIN : estacionActual + AM_STEP;
        }
    }

    public void bajarEstacion() {
        if (!encendida) return;

        if (modo.equals("FM")) {
            estacionActual = (estacionActual - FM_STEP < FM_MIN) ? FM_MAX : Math.round((estacionActual - FM_STEP) * 10.0) / 10.0;
        } else if (modo.equals("AM")) {
            estacionActual = (estacionActual - AM_STEP < AM_MIN) ? AM_MAX : estacionActual - AM_STEP;
        }
    }    }