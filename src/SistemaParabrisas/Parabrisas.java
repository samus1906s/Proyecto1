/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaParabrisas;

/**
 *
 * @author samue
 */
public class Parabrisas {
    private boolean encendido;
    private Velocidades velocidad;

    public boolean isEncendido() {
        return encendido;
    }

    public Velocidades getVelocidad() {
        return velocidad;
    }

    public Parabrisas() {
        this.encendido = false;
        this.velocidad = Velocidades.BAJA;
    }
    
    public void encender(){
        this.encendido=true;
        this.velocidad = Velocidades.BAJA;
    }
    
    public void apagar(){
        this.encendido=false;
    }
    
    public void cambiarVelocidad(Velocidades velocidadNueva){
        if(encendido){
            velocidad = velocidadNueva;
        }
    }

    @Override
    public String toString() {
        return "Parabrisas{" + "encendido=" + encendido + ", velocidad=" + velocidad + '}';
    }
    
    
}
