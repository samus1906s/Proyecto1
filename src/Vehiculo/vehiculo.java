/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculo;
import SistemaIluminacion.Iluminacion;
import SistemaIluminacion.TipoLuz;
import MotorVehiculo.Motor;
import AlarmaVehiculo.Alarma;
import VehiculoPuertas.Puerta;
import SistemaRadio.SistemaRadio;
import SistemaClimatizacion.Climatizacion;
import SistemaParabrisas.Parabrisas;
import SistemasCinturones.Cinturones;
import VehiculoReversaFreno.SistemaReversaFrenoMano;
import AcelerarVehiculo.Acelerar;
import CombustibleVehiculo.Combustible;
import SistemaKilometraje.SistemaKilometraje;
/**
 *
 * @author samue
 */
public class vehiculo {
   
   private Iluminacion luz;
   private Motor motor;
   private Alarma alarma;
   private Puerta puerta;
   private SistemaRadio radio;
   private Climatizacion climatizacion;
   private Parabrisas parabrisas;
   private Cinturones cinturon;
   private SistemaReversaFrenoMano frenoMano;
   private Acelerar acelerar;
   private Combustible combustible;
   private SistemaKilometraje kilometraje;

    public Iluminacion getLuz() {
        return luz;
    }

    public Motor getMotor() {
        return motor;
    }

    public Alarma getAlarma() {
        return alarma;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public SistemaRadio getRadio() {
        return radio;
    }

    public Climatizacion getClimatizacion() {
        return climatizacion;
    }

    public Parabrisas getParabrisas() {
        return parabrisas;
    }

    public Cinturones getCinturon() {
        return cinturon;
    }

    public SistemaReversaFrenoMano getFrenoMano() {
        return frenoMano;
    }

    public Acelerar getAcelerar() {
        return acelerar;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public SistemaKilometraje getKilometraje() {
        return kilometraje;
    }
    
    public vehiculo() {
        luz = new Iluminacion(TipoLuz.DELANTERA_BAJA);
        motor = new Motor();
        puerta = new Puerta(); 
        alarma = new Alarma(puerta,motor);
        radio = new SistemaRadio();
        climatizacion = new Climatizacion(motor);
        parabrisas = new Parabrisas();
        cinturon = new Cinturones(motor, alarma);
        frenoMano = new SistemaReversaFrenoMano();
        acelerar = new Acelerar();
        combustible = new Combustible(7.8);
        kilometraje = new SistemaKilometraje(motor, acelerar);
    }
    
    public void encenderVehiculo(){
        if(!alarma.isStateAlarm() && combustible.getFuelLevel() > 0){
           motor.encender();
           radio.encender();
           climatizacion.encenderAC();
        }
    }
   
    public void apagarVehiculo(){
        if(alarma.isStateAlarm()){
           motor.apagar();
           radio.apagar();
           climatizacion.apagarAC();
        }
    }
    
    public boolean estaEncendido() {
    return motor.isState(); 
   }
   
}
