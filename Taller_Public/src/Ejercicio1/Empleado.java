/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author camilo.torreso
 */
public class Empleado {
    public String nombre;
    private double salario;
    
    public Empleado(String nombre, double salario){
        this.nombre= nombre;
        this.salario = salario;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
         if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Error: El salario no puede ser negativo.");
        }
    }
    
}
