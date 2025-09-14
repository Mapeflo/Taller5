/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5;

import vehiculos.Vehiculo;
import vehiculos.Moto;       
/**
 *
 * @author marya
 */
class pruebaVehiMoto {
   public static void main(String[] args) {
    
   Vehiculo vehiculo = new Vehiculo("Camioneta");    
   Moto moto = new Moto("Doble proposito");    
       
       System.out.println("Tipo de vehiculo: " + vehiculo.tipo);
       System.out.println("Tipo de moto" + moto.tipo);
    } 
}
