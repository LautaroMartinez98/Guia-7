/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//• Agregar un método de creación del objeto que respete la siguiente firma:
//crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
//usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
//fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
//• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
//en cuenta que para conocer la edad de la persona también se debe conocer la fecha
//actual.
//• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
//edad y retorna true en caso de que el receptor tenga menor edad que la persona que
//se recibe como parámetro, o false en caso contrario.
//• Metodo mostrarPersona(): este método muestra la persona creada en el método
//anterior.
package Servicios;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PersonaService {

    public void crearPersona(Persona p1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el nombre de la persona: ");
        p1.setNombre(leer.next());
        System.out.println("ingrese la fecha de nacimiento: ");
        int dia = leer.nextInt();
        int mes = leer.nextInt() -1;
        int ano = leer.nextInt() -1900;
        Date fecha = new Date(ano, mes, dia);
        
    }
    public void calcularEdad(Persona p1){
        Date actual = new Date();
        int edad = actual.getYear() - fecha.getYear();
        System.out.println("la edad de la persona es: "+ edad);
                
               
        
    }
}
