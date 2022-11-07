/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raices;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class service {

    public void valores(Raices r1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el valor de a: ");
        r1.setA(leer.nextDouble());
        System.out.println("ingrese el valor de b: ");
        r1.setB(leer.nextDouble());
        System.out.println("ingrese el valor de c: ");
        r1.setC(leer.nextDouble());
    }

    public double getDiscriminante(Raices r1) {
        double discriminante = (Math.pow(r1.getB(), 2)) - 4 * r1.getA() * r1.getC();
        return discriminante;

    }

    public boolean tieneRaices(Raices r1) {
        boolean rai = false;
        if (getDiscriminante(r1)>= 0) {
            rai = true;
        }
        return rai;
    }
    public boolean tieneRaiz(Raices r1) {
        boolean rai1 = false;
        if (getDiscriminante(r1)== 0) {
            rai1 = true;
        }
        return rai1;
    }
    public void obtenerRaices(Raices r1) {
        if (tieneRaices(r1)) {
            System.out.println("las dos posibles soluciones son: "+ (-r1.getB()+ Math.sqrt((Math.pow(r1.getB(), 2)) - 4 * r1.getA() * r1.getC())/2*r1.getA()) );
            System.out.println("y : "+ (-r1.getB()- Math.sqrt((Math.pow(r1.getB(), 2)) - 4 * r1.getA() * r1.getC())/2*r1.getA()) );
        }
        
    }
    public void obtenerRaiz(Raices r1) {
        if (tieneRaiz(r1)){
            System.out.println("la solucion es: "+ (-r1.getB()+ Math.sqrt((Math.pow(r1.getB(), 2)) - 4 * r1.getA() * r1.getC())/2*r1.getA()));
        }
    }
    public void calcular(Raices r1) {
        if (getDiscriminante(r1) < 0) {
            System.out.println("no tiene solucion");
        }
        else if (tieneRaiz(r1)) {
            obtenerRaiz(r1);
            
        }
        else {
            obtenerRaices(r1);
        }
    }
//    esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
////pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
////obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
////de no existir solución, se mostrará un mensaje.
}
//(-b±√((b^2)-(4*a*c)))/(2*a)
