/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ej1;

import entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
class LibroServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void cargaLibro(Libro L1) { 
        System.out.println("Ingrese el Titulo del Libro");
        L1.titulo = leer.next();
        System.out.println("Ingrese el autor");
        L1.autor = leer.next();
        System.out.println("Ingrese el ISBN del libro");
        L1.ISBN = leer.next();
        System.out.println("Ingrese el numero de Paginas");
        L1.nPaginas = leer.next();
        }
    /**
     * Muestra el Libro
     */
    public void mostrarLibro(Libro L1) {
        System.out.println("El titulo es: " + L1.titulo);
        System.out.println("El autor es: " + L1.autor);
        System.out.println("El ISBN es: " + L1.ISBN);
        System.out.println("El numero de paginas es: " + L1.nPaginas);
    }
        
                
    
}
