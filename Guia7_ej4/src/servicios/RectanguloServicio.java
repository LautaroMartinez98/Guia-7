/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RectanguloServicio {
    public void crearRectangulo(Rectangulo O1){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese altura");
        O1.setAltura(leer.nextInt());
        System.out.println("Ingrese base");
        O1.setBase(leer.nextInt());
        
    }
     public int calcularSuperficie(Rectangulo O1){
        return(O1.getAltura()*O1.getBase());
    }
      public int calcularPerimetro(Rectangulo O1){
        return((O1.getAltura()+O1.getBase())*2);
    }
       public void dibujarRectangulo(Rectangulo O1){
        for (int i = 0; i < O1.getAltura(); i++) {
            for (int j = 0; j < O1.getBase(); j++) {
                if (i==0 || i==O1.getAltura()-1 || j==0 || j==O1.getBase()-1){
                  System.out.print("* ");  
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println(" ");
        }
    } 
}

