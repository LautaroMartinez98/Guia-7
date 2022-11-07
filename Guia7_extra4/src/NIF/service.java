/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NIF;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class service {

    Scanner leer = new Scanner(System.in);

    public void crearNif(NIF n1) {
        
        do {
            System.out.println("ingrse el dni: ");
            n1.setDNI(leer.nextLong());
        } while (n1.getDNI()> 99999999);
        
        
        char[] vector = new char[]{'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C',
            'K', 'E'};
        int lugar = (int) n1.getDNI() % 23;
        System.out.println("la letra que le corresponde al numero de documento es: " + vector[lugar]);
        n1.setLetra(vector[lugar]);
    }

    public void mostrar(NIF n1) {
        if (Long.toString(n1.getDNI()).length() == 8) {
            System.out.println(n1.getDNI() + " - " + n1.getLetra());
        } else {
            for (int i = 0; i < 8 - Long.toString(n1.getDNI()).length(); i++) {
                System.out.print("0");
            }
            System.out.println(n1.getDNI() + " - " + n1.getLetra());
        }

    }

}
