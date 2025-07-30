/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VehiculoReversaFreno;

/**
 *
 * @author Valdelomaar
 */
public class SistemaReversaFrenoMano {

    private boolean frenoManoActivo;
    private boolean modoReversa;
    private boolean sensorReversaActivo;

    public SistemaReversaFrenoMano() {
        this.frenoManoActivo = false;
        this.modoReversa = false;
        this.sensorReversaActivo = false;
    }

    public void jalarPalancaFrenoMano() {
        frenoManoActivo = true;
    }

    public void presionarBotonFrenoMano() {
        frenoManoActivo = false;
    }

    public boolean estaFrenoManoActivo() {
        return frenoManoActivo;
    }

    public void activarModoReversa() {
        modoReversa = true;
        sensorReversaActivo = true;
    }

    public void desactivarModoReversa() {
        modoReversa = false;
        sensorReversaActivo = false;
    }

    public boolean estaEnReversa() {
        return modoReversa;
    }

    public boolean estaSensorReversaActivo() {
        return sensorReversaActivo;
    }

    public boolean debeEmitirAlertaPorFrenoYMovimiento() {
        return frenoManoActivo;
    }

    public boolean debeEmitirAlertaPorObstaculoEnReversa() {
        return modoReversa && sensorReversaActivo;
    }

    public String obtenerEstadoSistema() {
        StringBuilder estado = new StringBuilder();
        estado.append("Freno de Mano: ").append(frenoManoActivo ? "Activado" : "Desactivado").append("\n");
        estado.append("Modo Reversa: ").append(modoReversa ? "Activo" : "Inactivo").append("\n");
        estado.append("Sensor de Reversa: ").append(sensorReversaActivo ? "Activo" : "Inactivo");
        return estado.toString();
    }
}
