/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vehiculos;

public class Vehiculos {   
       
    private String marca;
    private String modelo;

    public Vehiculos (String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void conducir() {
        System.out.println("El vehículo está en movimiento.");
    }

    public String obtenerMarca() {
        return marca;
    }

    public String obtenerModelo() {
        return modelo;
    }  
        
    }

