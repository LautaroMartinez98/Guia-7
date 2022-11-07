//Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
//los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
//de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
//programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
//un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto.
package guia7_extra5;

//@author Usuario
import java.util.Scanner;

public class Guia7_extra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = meses[1];
        String rta;

        System.out.println("ingrese un mes: ");
        rta = leer.next();

        while (!rta.equalsIgnoreCase(mesSecreto)) {
           
            System.out.println("el mes es incorrecto, ingrese un mes nuevamente: ");
            rta = leer.next();
        }
        System.out.println("Has acertado");
       

    }

}
