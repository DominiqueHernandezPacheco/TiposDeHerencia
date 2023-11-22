/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.empleado;


public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public void trabajar() {
        System.out.println("El empleado está trabajando.");
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerSalario() {
        return salario;
    }
   
}
