//Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
//(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
//actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
//• Constructor predeterminado o vacío
//• Constructor con la capacidad máxima y la cantidad actual
//• Métodos getters y setters.
//• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
//• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza.
//• Método vaciarCafetera(): pone la cantidad de café actual en cero.
//• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada.
package guia7_ej6;

//@author Usuario
import Entidad.Cafetera;
import Servicio.CafeteraService;
import java.util.Scanner;

public class Guia7_ej6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CafeteraService c1 = new CafeteraService();
        Cafetera o1 = new Cafetera();
        int opc;
        do {
            System.out.println("MENU\n"
                    + "1. servir taza\n"
                    + "2. llenar cafetera\n"
                    + "3. vaciar cafetera\n"
                    + "4. agregar cafe\n"
                    + "5. salir\n"
                    + "Elija opción:");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("elija un tamaño de taza: ");
                    c1.servirTaza(o1, leer.nextInt());
                    break;
                case 2:
                    c1.llenarCafetera(o1);
                    break;
                case 3:
                    c1.vaciarCafetera(o1);
                    break;
                case 4:
                    System.out.println("indique una cantidad de cafe para agregar: ");
                    c1.agregarCafe(o1, leer.nextInt());
                    break;

                default:
                    if (opc != 5) {
                        System.out.println("numero invalido");
                    }
            }
        } while (opc != 5);

    }

}
