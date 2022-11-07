package Servicios;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AhorcadoService {

    public void crearJuego(Ahorcado a1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una palabra: ");
        String palabra = leer.next();
        String dimension[] = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            dimension[i] = (String.valueOf(palabra.charAt(i)));
        }
        a1.setPalabra(dimension);
        System.out.println("ingrese la cantidad de jugadas maximas: ");
        a1.setJugadasMaximas(leer.nextInt());
        a1.setLetrasEncontradas(0);

    }

    public void longitud(Ahorcado a1) {
        System.out.println(a1.getPalabra().length);
    }

    public boolean buscar(Ahorcado a1, String letra) {
        boolean esta = false;
        for (String palabra : a1.getPalabra()) {
            if (letra.equalsIgnoreCase(palabra)) {
                a1.setLetrasEncontradas(a1.getLetrasEncontradas() + 1);
                esta = true;
            }
        }
        if (esta) {
            System.out.println("la letra fue encontrada");
        }
        else {
            System.out.println("la letra no esta");
            
        }
        return esta;
    }
    public void intentos(Ahorcado a1, String letra) {
        if (!buscar(a1, letra)) {
          a1.setJugadasMaximas(a1.getJugadasMaximas()-1);  
        }
        System.out.println();
        
            
    }
    


    }

