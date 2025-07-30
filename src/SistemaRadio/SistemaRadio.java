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
    private ModoRadio modo;
    private double estacionActual;
    private String dispositivoBluetooth;
    private boolean bluetoothConectado;

    // Rangos para AM y FM
    private final double AM_MIN = 530;
    private final double AM_MAX = 1700;
    private final double AM_STEP = 10;

    private final double FM_MIN = 88.1;
    private final double FM_MAX = 107.9;
    private final double FM_STEP = 0.2;

    public Radio() {
        this.encendida = false;
        this.modo = ModoRadio.FM;
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
                bluetoothConectado = false;
                dispositivoBluetooth = "";
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

    public void conectarBluetooth(String nombreDispositivo) {
        if (!encendida || modo != ModoRadio.BLUETOOTH) return;

        dispositivoBluetooth = nombreDispositivo;
        bluetoothConectado = true;
    }

    public void desconectarBluetooth() {
        bluetoothConectado = false;
        dispositivoBluetooth = "";
    }

    // ================= GETTERS =================

    public boolean isEncendida() {
        return encendida;
    }

    public ModoRadio getModo() {
        return modo;
    }

    public double getEstacionActual() {
        return estacionActual;
    }

    public boolean isBluetoothConectado() {
        return bluetoothConectado;
    }

    public String getDispositivoBluetooth() {
        return dispositivoBluetooth;
    }

    public String getEstadoGeneral() {
        if (!encendida) return "Radio apagada.";

        String estado = "Modo: " + modo.name();

        switch (modo) {
            case FM:
            case AM:
                estado += " | Estación: " + estacionActual;
                break;
            case BLUETOOTH:
                estado += bluetoothConectado
                        ? " | Conectado a: " + dispositivoBluetooth
                        : " | No conectado";
                break;
        }

        return estado;
    }
}