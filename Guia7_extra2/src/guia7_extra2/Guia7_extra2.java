//Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
//atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
//usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
//los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
//que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
//calcular la distancia entre dos puntos consulte el siguiente link:

package guia7_extra2;

//@author Usuario

import Entidad.Puntos;
import Puntos.service;


public class Guia7_extra2 {

    public static void main(String[] args) {
        service s1 = new service();
        Puntos p1 = new Puntos();
        s1.crearPuntos(p1);
        s1.distancia(p1);
    }


}
