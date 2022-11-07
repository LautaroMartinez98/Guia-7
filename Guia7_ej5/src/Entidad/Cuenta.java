/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Cuenta {
    private int numeroCuenta;
    private int dni;
    private double saldo;

    public Cuenta() {
        this.saldo = 0;
    }

    public Cuenta(int numeroCuenta, int dni) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = 0;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getDni() {
        return dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", dni=" + dni + ", saldo=" + saldo + '}';
    }
    
   
}
