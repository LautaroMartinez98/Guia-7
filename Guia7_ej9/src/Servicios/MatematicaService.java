/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Matematica;

/**
 *
 * @author Usuario
 */
public class MatematicaService {
    public double devolverMayor(Matematica m1) {
        double mayor= 0;
        double menor= 0;
        if (m1.getNum1()> m1.getNum2()) {
            mayor = m1.getNum1();
            menor= m1.getNum2();
            return mayor;
        }
        else {
            mayor=m1.getNum2();
            menor=m1.getNum1();
            return mayor;
        }
        
    }
    public void calcularPotencia(Matematica m1) {
        double mayor= 0;
        double menor= 0;
        if (m1.getNum1()> m1.getNum2()) {
            mayor = m1.getNum1();
            menor= m1.getNum2();
            System.out.println("la potencia del numero mayor elevado al menor es: "+ Math.pow(mayor, menor)) ;
        }
        else {
            mayor=m1.getNum2();
            menor=m1.getNum1();
            System.out.println("la potencia del numero mayor elevado al menor es: "+ Math.pow(mayor, menor)) ;
        }
                
    }
    public void calcularRaiz(Matematica m1) {
        if (m1.getNum1()> m1.getNum2()) {
            System.out.println("la raiz cuadrada del numero menor es: "+ Math.sqrt(m1.getNum2())); 
        }
        else {
            System.out.println("la raiz cuadrada del numero menor es: "+ Math.sqrt(m1.getNum1()));
        }
    }
}
