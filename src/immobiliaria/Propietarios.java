/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immobiliaria;

/**
 *
 * @author Marcos
 */
public class Propietarios {
    
    private String dni;
    private String nombre;

    public Propietarios(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Propietarios{" + "dni=" + dni + ", nombre=" + nombre + '}';
    }
    
    
    
}
