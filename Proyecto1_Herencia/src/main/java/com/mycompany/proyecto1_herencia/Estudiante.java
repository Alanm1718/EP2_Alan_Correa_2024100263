/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_herencia;

/**
 *
 * @author laboratorioasu
 */
public class Estudiante  extends  Persona {
    private String carrera;
    public Estudiante(String nombre, String carrera){
    
        super(nombre);
        this.carrera = carrera;
    
    }
    
    public void mostrarDatos () {System.out.print("Estudiante:" +nombre+ "carrera:" + carrera);}
    
    
    
    
}
