/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VehiculoPuertas;

/**
 *
 * @author Valdelomaar
 */
public class Puerta {
    private boolean abierta;

    public Puerta() {
        this.abierta = false;
    }

    public boolean abrir() {
        if (!abierta) {
            abierta = true;
            return true;
        }
        return false;
    }

    public boolean cerrar() {
        if (abierta) {
            abierta = false;
            return true; // Se cerro la puerta
        }
        return false; // Ya estaba cerrada
    }

    public boolean estaAbierta() {
        return abierta;
    }

}
