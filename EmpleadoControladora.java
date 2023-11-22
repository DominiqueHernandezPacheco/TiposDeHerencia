/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.empleado;


public class EmpleadoControladora {

    
    public static void main(String[] args) {
        
        Desarrollador desarrollador = new Desarrollador("Juan", 28, 60000.0, "Java");
        desarrollador.trabajar(); // Método heredado de Empleado
        desarrollador.codificar(); // Método específico de Desarrollador

        System.out.println("Salario del desarrollador: " + desarrollador.obtenerSalario());

        Gerente gerente = new Gerente("Ana", 35, 80000.0, "Desarrollo");
        gerente.trabajar(); // Método heredado de Empleado
        gerente.gestionarProyecto(); // Método específico de Gerente

        System.out.println("Nombre del gerente: " + gerente.obtenerNombre());
    }
        
        
    }
    

