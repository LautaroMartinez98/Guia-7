/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CadenaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void mostrarVocales(Cadena c1) {
        String palabra = c1.getFrase();
        palabra = palabra.toLowerCase();
        int cont = 0;

        for (int i = 0; i < c1.getLongitud(); i++) {
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u') {
                cont++;
            }
        }
        System.out.println("Hay un total de " + cont + " vocales");
    }

    public void invertirFrase(Cadena c1) {
        for (int i = c1.getLongitud() - 1; i >= 0; i--) {
            System.out.print(c1.getFrase().charAt(i));
        }
        System.out.println(" ");
    }

    public void vecesRepetido(Cadena c1) {

        String palabra = c1.getFrase(), letra;
        palabra = palabra.toLowerCase();
        int cont = 0;
        System.out.println("Ingrese una letra y veremos cuantas veces se encuentra en la frase");
        letra = leer.next();
        letra = letra.toLowerCase();

        for (int i = 0; i < c1.getLongitud(); i++) {
            if (palabra.substring(i, i + 1).equals(letra)) {
                cont++;
            }
        }
        System.out.println("Se repite un total de " + cont + " veces en la frase");
    }

    public void compararLongitud(Cadena c1) {
        String frase2;
        int longitud2;
        System.out.println("Ingrese una nueva frase");
        frase2 = leer.next();
        longitud2 = frase2.length();
        if (c1.getLongitud() > longitud2) {
            System.out.println("La frase ingresada es mas corta");
        }
        else if (c1.getLongitud() == longitud2) {
            System.out.println("las frases son de la misma longitud");
        } else {
            System.out.println("La frase ingresada es mas larga");
        }
    }

    public void unirFrase(Cadena c1) {
        String frase2;
        System.out.println("Ingrese una nueva frase");
        frase2 = leer.next();

        c1.setFrase(c1.getFrase() + " " + frase2);
        System.out.println("La frase concatenada es: " + c1.getFrase());
        c1.setLongitud((c1.getFrase().length()));
    }

    public void reemplazar(Cadena c1) {
        String letra;
        String palabra = c1.getFrase();

        System.out.println("Ingrese un caracter o letra para reemplazar la letra a");
        letra = leer.next();

        for (int i = 0; i < c1.getLongitud(); i++) {

            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'A') {
                palabra = palabra.replace('a', letra.charAt(0));
            }
        }
        System.out.println(palabra);
    }

    public void contiene(Cadena c1) {
        boolean contiene = false;
        String mensaje;
        String palabra = c1.getFrase(), letra;
        palabra = palabra.toLowerCase();
        int cont = 0;
        System.out.println("Ingrese una letra y veremos si esta o no...");
        letra = leer.next();
        letra = letra.toLowerCase();
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (palabra.substring(i, i + 1).equals(letra)) {
                cont++;
                break;
            }
        }
        if (cont == 1) {
            contiene = true;
            System.out.println("La letra '" + letra + "' esta incluida");
        } else if (cont == 0) {
            contiene = false;
            System.out.println("La letra '" + letra + "' no esta incluida");
        }

    }
}
