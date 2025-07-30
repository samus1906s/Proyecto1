/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package SistemaRadio;

/**
 *
 * @author Valdelomaar
 */
public enum ModoRadio {
    AM("Modo AM"),
    FM("Modo FM"),
    BLUETOOTH("Modo Bluetooth");
    
    private final String descripcion;

    ModoRadio(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
        
        
    }

    @Override
    public String toString() {
        return "ModoRadio{" + "ordinal=" + ordinal() + ", name=" + name() + ", descripcion=" + descripcion + '}';
    }
}

