/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author camilo.torreso
 */
public class Prueba {
    public static void main(String[] args) {
        cuentaBancaria cuenta = new cuentaBancaria("123", 0, "Ahorro");
        // Intento de acceso a numeroCuenta (privado, generará un error si se descomenta)
        // System.out.println(cuenta.numeroCuenta); // Esto causará un error de compilación

        // Uso del getter y setter para saldo
        System.out.println("Saldo inicial: " + cuenta.getSaldo());
        cuenta.setSaldo(1500.75);
        System.out.println("Saldo actualizado: " + cuenta.getSaldo());
        
        // Mostrar detalles de la cuenta
        cuenta.mostrarDetalles();
    }
}

