//Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
//y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
//que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
//través de los métodos set, se guardará la frase y la longitud de manera automática según
//la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:

package guia7_ej08;

//@author Usuario

import Entidad.Cadena;
import Servicios.CadenaService;
import java.util.Scanner;


public class Guia7_ej08 {

    public static void main(String[] args) {
        CadenaService cs = new CadenaService();
        Cadena c1 = new Cadena();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese una frase");
        c1.setFrase(leer.next());
        c1.setLongitud(c1.getFrase().length());
        cs.mostrarVocales(c1);
        cs.invertirFrase(c1);
        cs.vecesRepetido(c1);
        cs.compararLongitud(c1);
        cs.unirFrase(c1);
        cs.reemplazar(c1);
        cs.contiene(c1);
    }


}
