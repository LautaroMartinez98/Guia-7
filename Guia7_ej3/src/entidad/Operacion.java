/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Operacion {

    private int num1, num2;

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese ambos numeros: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
    }

    public int suma(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }

    public int resta(int num1, int num2) {
        int resta = num1 - num2;
        return resta;
    }

    public int multiplicacion(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        } else {
            int multiplicacion = num1 * num2;

            return multiplicacion;
        }
    }

    public int division(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        } else {
            int division = num1 / num2;
            return division;
        }
    }
}
