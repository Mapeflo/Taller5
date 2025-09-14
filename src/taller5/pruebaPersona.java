/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5;

/**
 *
 * @author marya
 */
class pruebaPersona {
    
    public static void main(String[] args) {
    
    Persona persona = new Persona ("Andres", 20);
    
        System.out.println("Nombre: " + persona.nombre);
    
        System.out.println("Edad: " + persona.edad);
        
        System.out.println("Nombre get: " + persona.getNombre());
        
        persona.setNombre("Luis");
        System.out.println("Nombre nuevo con set: " + persona.getNombre());
    }  
}
