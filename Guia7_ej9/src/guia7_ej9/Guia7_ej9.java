//Realizar una clase llamada Matemática que tenga como atributos dos números reales con
//los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
//constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
//Math.random para generar los dos números y se guardaran en el objeto con su
//respectivos set. Deberá además implementar los siguientes métodos:
//a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
//b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
//al menor número. Previamente se deben redondear ambos valores.
//c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

package guia7_ej9;

//@author Usuario

import Entidad.Matematica;
import Servicios.MatematicaService;


public class Guia7_ej9 {

    public static void main(String[] args) {
        MatematicaService ms = new MatematicaService();
        Matematica m1 = new Matematica();
        m1.setNum1((int)(Math.random() * 100));
        System.out.println("el primer numero es: "+ m1.getNum1());
        m1.setNum2((int)(Math.random() * 100));
        System.out.println("el segundo numero es: "+ m1.getNum2());
        System.out.println("el mayor de ambos numeros es: "+ ms.devolverMayor(m1));
        ms.calcularPotencia(m1);
        ms.calcularRaiz(m1);
        
        
    }


}
