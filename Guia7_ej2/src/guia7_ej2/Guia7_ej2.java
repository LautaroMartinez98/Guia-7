

package guia7_ej2;

//@author Usuario

import entidad.Circunferencia;


public class Guia7_ej2 {

    public static void main(String[] args) {
        Circunferencia c1= new Circunferencia();
        double radio = c1.crearCircunferencia();
        c1.area(radio);
        c1.perimetro(radio);
    }


}
