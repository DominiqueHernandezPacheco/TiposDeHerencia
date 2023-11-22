/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.animal;


public class AnimalControladora {

    
    public static void main(String[] args) {
        
        Perro miPerro = new Perro("Buddy", 3, "Labrador");
        miPerro.hacerSonido(); // Método heredado de Animal
        miPerro.ladrar(); // Método específico de Perro

        System.out.println("Nombre del perro: " + miPerro.obtenerNombre());

        Gato miGato = new Gato("Whiskers", 2, true);
        miGato.hacerSonido(); // Método heredado de Animal
        miGato.maullar(); // Método específico de Gato

        System.out.println("Edad del gato: " + miGato.obtenerEdad());
    }
 }
    

