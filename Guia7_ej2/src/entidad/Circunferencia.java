//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
//tipo real. A continuación, se deben crear los siguientes métodos:
//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
//objeto.
//d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
//e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
package entidad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Circunferencia {

    private double radio;
    
    public void perimetro (double radio) {
        System.out.println("el perimetro es igual a "+ 2 * 3.14 * radio);
    }
    
    public void area(double radio) {
        System.out.println("el area del circulo es: "+ 3.14 * Math.pow(radio, 2));
    }

    public double crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el radio: ");
        return leer.nextDouble();
    }

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

}
