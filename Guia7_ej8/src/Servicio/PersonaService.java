/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PersonaService {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        String sexo;
        Persona p1 = new Persona();
        System.out.println("ingrese nombre: ");
        p1.setNombre(leer.next());
        System.out.println("ingrese edad: ");
        p1.setEdad(leer.nextInt());
        do {
            System.out.println("ingrese sexo: ");
            p1.setSexo(sexo = leer.next());
        } while (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O"));
        System.out.println("ingrese altura: ");
        p1.setAltura(leer.nextDouble());
        System.out.println("ingrese su peso: ");
        p1.setPeso(leer.nextInt());
        return p1;
    }

    public int calcularIMC(Persona p1) {
        double IMC = (double) p1.getPeso() / Math.pow(p1.getAltura(), 2);
        if (IMC < 20) {
            return -1;
        } else if ((25 >= IMC) && (IMC >= 20)) {
            return 0;
        } else {
            return 1;
        }
    }
    public boolean esMayorDeEdad(Persona p1) {
        return (p1.getEdad()>= 18);
    }

}
