/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PC
 */
public class Contacto {
    private String Nombre;
    private String Telefono;

    public Contacto(String Nombre, String Telefono) {
        this.Nombre = Nombre;
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }
    
}
