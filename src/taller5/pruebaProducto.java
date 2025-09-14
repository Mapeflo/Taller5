/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5;

/**
 *
 * @author marya
 */
class pruebaProducto {
  
    public static void main(String[] args) {
     
     Producto producto = new Producto("Televisor",2000000,20);   
        
        System.out.println("Aceddiendo a propiedades");
        System.out.println("Nombre: " + producto.nombre);
        System.out.println("Precio: " + producto.precio);
        System.out.println("Stock: " + producto.stock);
        
        System.out.println("Accediendo a mostrarInfo()");
        producto.mostrarInfo();
        
        
        producto.stock = 10;
        System.out.println("Ultima actualizacion:");
        producto.mostrarInfo();
    }   
}
