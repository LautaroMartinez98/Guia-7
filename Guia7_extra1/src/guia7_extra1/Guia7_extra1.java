//Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́definir
//además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
//otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
//definir los métodos getters y setters correspondientes.

package guia7_extra1;

//@author Usuario

import Entidad.Cancion;
import java.util.Scanner;

public class Guia7_extra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cancion c1 = new Cancion();
        System.out.println("diga el nombre de la cancion: ");
        c1.setTitulo(leer.nextLine());
        System.out.println("diga el autor de la cancion: ");
        c1.setAutor(leer.nextLine());
        System.out.println("la cancion es: "+ c1.getTitulo()+ " de " +c1.getAutor());
    }
}
    
    
