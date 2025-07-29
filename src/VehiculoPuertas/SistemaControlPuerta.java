/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VehiculoPuertas;
import MotorVehiculo.Motor;
/**
 *
 * @author Valdelomaar
 */
public class SistemaControlPuerta {
    private Puerta puertaDelanteraIzquierda;
    private Puerta puertaDelanteraDerecha;
    private Puerta puertaTraseraIzquierda;
    private Puerta puertaTraseraDerecha;
    private Motor motor;

    public SistemaControlPuerta(Motor motor) {
        this.motor = motor;
        this.puertaDelanteraIzquierda = new Puerta();
        this.puertaDelanteraDerecha = new Puerta();
        this.puertaTraseraIzquierda = new Puerta();
        this.puertaTraseraDerecha = new Puerta();
    }

    public void abrirPuerta(String puerta) {
        Puerta p = obtenerPuerta(puerta);
        if (p != null) {
            p.abrir();
        }
    }

    public void cerrarPuerta(String puerta) {
        Puerta p = obtenerPuerta(puerta);
        if (p != null) {
            p.cerrar();
        }
    }

    public boolean estaPuertaAbierta(String puerta) {
        Puerta p = obtenerPuerta(puerta);
        return p != null && p.estaAbierta();
    }

    public boolean hayPuertasAbiertas() {
        return puertaDelanteraIzquierda.estaAbierta() ||
               puertaDelanteraDerecha.estaAbierta() ||
               puertaTraseraIzquierda.estaAbierta() ||
               puertaTraseraDerecha.estaAbierta();
    }

    public String obtenerEstadoGeneral() {
        StringBuilder estado = new StringBuilder();
        if (motor.isState()) {
            estado.append("Estado de puertas (motor encendido):\n");
            estado.append("Delantera Izquierda (di): ").append(puertaDelanteraIzquierda.estaAbierta() ? "Abierta" : "Cerrada").append("\n");
            estado.append("Delantera Derecha   (dd): ").append(puertaDelanteraDerecha.estaAbierta() ? "Abierta" : "Cerrada").append("\n");
            estado.append("Trasera Izquierda   (ti): ").append(puertaTraseraIzquierda.estaAbierta() ? "Abierta" : "Cerrada").append("\n");
            estado.append("Trasera Derecha     (td): ").append(puertaTraseraDerecha.estaAbierta() ? "Abierta" : "Cerrada");
        } else {
            estado.append("Motor apagado. Estado de puertas no disponible en panel.");
        }
        return estado.toString();
    }

    private Puerta obtenerPuerta(String nombre) {
        return switch (nombre.toLowerCase()) {
            case "di" -> puertaDelanteraIzquierda;
            case "dd" -> puertaDelanteraDerecha;
            case "ti" -> puertaTraseraIzquierda;
            case "td" -> puertaTraseraDerecha;
            default -> null;
        };
    }
}
