/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Puntos;
//crearPuntos() que le pide al usuario los dos números y los ingresa en
////los atributos del objeto

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class service {
    public void crearPuntos(Puntos p1) {
    Scanner leer = new Scanner (System.in);
        System.out.println("ingrese x1: ");
        p1.setX1(leer.nextDouble());
        System.out.println("ingrese y1: ");
        p1.setY1(leer.nextDouble());
        System.out.println("ingrese x2: ");
        p1.setX2(leer.nextDouble());
        System.out.println("ingrese y2: ");
        p1.setY2(leer.nextDouble());
        
    }
    public void distancia(Puntos p1) {
        
        System.out.println("la distancia entre los dos puntos es: "+ (Math.sqrt(Math.pow((p1.getX2()-p1.getX1()), 2))+ (Math.pow((p1.getY2()-p1.getY1()), 2))));
        
    }
    
}
