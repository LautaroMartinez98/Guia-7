//Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
//('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
//atributo, puede hacerlo. Los métodos que se implementarán son:
//• Un constructor por defecto.
//• Un constructor con todos los atributos como parámetro.
//• Métodos getters y setters de cada atributo.
//• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
//usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
//Si no es correcto se deberá mostrar un mensaje
//• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
//que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
//fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
//está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
//fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
//función devuelve un 1.
//• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
//un booleano.
package guia7_ej7;

//@author Usuario
import Entidad.Persona;
import Servicio.PersonaService;

public class Guia7_ej7 {

    public static void main(String[] args) {
        PersonaService ps = new PersonaService();
        int mayores = 0;
        int menores = 0;
        int debajo = 0;
        int ideal = 0;
        int encima = 0;
        Persona p1 = ps.crearPersona();
        switch (ps.calcularIMC(p1)) {
            case -1:
                System.out.println("esta debajo de su peso ideal. ");
                debajo++;
                break;
            case 0:
                System.out.println("esta en su peso ideal. ");
                ideal++;
                break;
            case 1:
                System.out.println("esta arriba de su peso ideal. ");
                encima++;
                break;
        }
        if (ps.esMayorDeEdad(p1)) {
            mayores++;
        } else {
            menores++;
        }

    
    Persona p2 = ps.crearPersona();

    switch (ps.calcularIMC (p2) ){
            case -1:
                System.out.println("esta debajo de su peso ideal. ");
                debajo++;
                break;
            case 0:
                System.out.println("esta en su peso ideal. ");
                ideal++;
                break;
            case 1:
                System.out.println("esta arriba de su peso ideal. ");
                encima++;
                break;
        }
        if (ps.esMayorDeEdad (p2) 
        ) {
            mayores++;
    }

    
        else {
            menores++;
    }


Persona p3 = ps.crearPersona();
        switch (ps.calcularIMC(p3)) {
            case -1:
                System.out.println("esta debajo de su peso ideal. ");
                debajo++;
                break;
            case 0:
                System.out.println("esta en su peso ideal. ");
                ideal++;
                break;
            case 1:
                System.out.println("esta arriba de su peso ideal. ");
                encima++;
                break;
        }
        if (ps.esMayorDeEdad(p3)) {
            mayores++;
        } else {
            menores++;
        }

    
 Persona p4 = ps.crearPersona();
        switch (ps.calcularIMC(p4)) {
            case -1:
                System.out.println("esta debajo de su peso ideal. ");
                debajo++;
                break;
            case 0:
                System.out.println("esta en su peso ideal. ");
                ideal++;
                break;
            case 1:
                System.out.println("esta arriba de su peso ideal. ");
                encima++;
                break;
        }
        if (ps.esMayorDeEdad(p4)) {
            mayores++;
        } else {
            menores++;
        }
        System.out.println("el promedio de personas por debajo de su peso es: "+ debajo*100/4+ "%\n" 
        + "el promedio de personas que estan en su peso ideal es: "+ ideal*100/4+ "%\n"
        +"el promedio de personas por encima de su peso es: "+ encima*100/4+ "%\n"
        +"el promedio de personas mayores de edad es: "+ mayores*100/4+ "%\n"
        +"el promedio de personas menores de edad es: "+ menores*100/4+ "%\n");
    }

}

