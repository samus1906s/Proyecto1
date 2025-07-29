/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AcelerarVehiculo;

/**
 *
 * @author samue
 */
public class Acelerar {
   private boolean marchas;
   private int velocidad;
   private int rpm;

    public boolean isMarchas() {
        return marchas;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getRpm() {
        return rpm;
    }

    public Acelerar() {
        this.marchas = false;
        this.velocidad = 0;
        this.rpm = 0;
    }
   
   public void marchaInicio(){
       this.marchas = true;
   }
   
   public void acelerar(){
       if(!marchas){
           return;
       }
       velocidad += 20;
       rpm += 1000;
   }

    @Override
    public String toString() {
        return "Acelerar{" + "marchas=" + marchas + ", velocidad=" + velocidad + ", rpm=" + rpm + '}';
    }
   
   
}
