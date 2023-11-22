/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.vehiculos;


public class VehiculosControladora {

    
    public static void main(String[] args) {
        
        Coche cochesito=new Coche("Mitsubishi","Mirage g4",4);
        Motocicleta motito= new Motocicleta ("Mortalika", "La mas barata", true);
        
        
        cochesito.abrirPuertas();
        cochesito.conducir();
        cochesito.obtenerMarca();
        cochesito.obtenerModelo();
        
        
        motito.conducir();
        motito.realizarAcrobacias();
        motito.obtenerMarca();
        motito.obtenerModelo();
                
    }
    
}
