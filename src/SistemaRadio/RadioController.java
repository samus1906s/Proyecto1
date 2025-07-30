/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaRadio;

/**
 *
 * @author Valdelomaar
 */
public class RadioController {
     private SistemaRadio radio;

    public RadioController(SistemaRadio radio) {
        this.radio = radio;
    }

    public void encenderRadio() {
        radio.encender();
    }

    public void apagarRadio() {
        radio.apagar();
    }

    public boolean estaEncendida() {
        return radio.isEncendida();
    }

    public void cambiarModo() {
        radio.cambiarModo();
    }

    public String getModoComoTexto() {
        return radio.getModo().name(); // "FM", "AM", "BLUETOOTH"
    }

    public String getEstacionActual() {
        if (radio.getModo() == ModoRadio.BLUETOOTH) return "";
        return String.valueOf(radio.getEstacionActual());
    }

    public void subirEstacion() {
        radio.subirEstacion();
    }

    public void bajarEstacion() {
        radio.bajarEstacion();
    }

    public String getEstadoParaPanel() {
        return radio.getEstadoGeneral();
    }
}
