//Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
//clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
//Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
//usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
//deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
//puede conseguir instanciando un objeto Date con constructor vacío.
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Ejemplo fecha actual: Date fechaActual = new Date();

package guia7_ej11;

//@author Usuario

import java.util.Date;
import java.util.Scanner;


public class Guia7_ej11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese una fecha en dia, mes y año ");
        int dia = leer.nextInt();
        int mes = leer.nextInt() -1;
        int ano = leer.nextInt() -1900;
        Date fecha = new Date(ano, mes, dia);
        System.out.println(fecha);
        Date actual = new Date();
        System.out.println(actual);
        int diferencia= actual.getYear() - fecha.getYear();
        System.out.println("la diferencia entre ambos años es "+ Math.abs(diferencia));
       
            
    }


}
