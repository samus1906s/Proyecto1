/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaIluminacion;

/**
 *
 * @author samue
 */
public class Iluminacion {
    private boolean estado;
    private TipoLuz tipo;

    public boolean isEstado() {
        return estado;
    }

    public TipoLuz getTipo() {
        return tipo;
    }

    public Iluminacion(TipoLuz tipo) {
        this.estado = false;
        this.tipo = tipo;
    }
    
    public void encerder(){
        this.estado=true;
    }
    
    public void apagar(){
        this.estado=false;
    }

    @Override
    public String toString() {
        return "Iluminacion{" + "estado=" + estado + ", tipo=" + tipo + '}';
    }
    
    
}
