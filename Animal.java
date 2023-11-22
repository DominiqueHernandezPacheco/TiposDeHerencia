/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.animal;

/**
 *
 * @author ADMIN
 */
public class Animal {

    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido genérico.");
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerEdad() {
        return edad;
    }
    
}
