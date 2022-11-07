/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CuentaService {

    Scanner leer = new Scanner(System.in);

    public CuentaService() {
    }

    public void crearCuenta(Cuenta c1) {
        System.out.println("ingrese numero de cuenta: ");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("ingrese su dni: ");
        c1.setDni(leer.nextInt());
    }

    public void ingresar(Cuenta c1) {
        System.out.println("ingrese una cantidad de dinero: ");
        c1.setSaldo(leer.nextDouble() + c1.getSaldo());
    }

    public void retirar(Cuenta c1) {
        System.out.println("ingrese una cantidad para retirar: ");
        double monto = leer.nextDouble();
        if (c1.getSaldo() < monto) {
            c1.setSaldo(0);
        } else {
            c1.setSaldo(c1.getSaldo() - monto);
        }
    }

    public void extraccionRapida(Cuenta c1) {
        System.out.println("ingrese un monto a retirar, solo puede ser el 20% ");
        double monto = leer.nextDouble();
        if (monto > c1.getSaldo() * 0.2) {
            System.out.println("retiro invalido");

        } else {
            c1.setSaldo(c1.getSaldo() - monto);
        }
    }

    public void consultarSaldo(Cuenta c1) {
        System.out.println("el saldo disponible es: "+ c1.getSaldo());
    }
   
}
