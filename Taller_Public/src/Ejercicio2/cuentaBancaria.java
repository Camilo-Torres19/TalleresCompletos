/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author camilo.torreso
 */
public class cuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;
    
    public cuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void mostrarDetalles(){
        System.out.println("----- Detalles Bancarios -------");
        System.out.println("Numero Cuenta: "+numeroCuenta);
        System.out.println("Saldo: "+saldo);
        System.out.println("Tipo de Cuenta: "+tipoCuenta);
    }
}
