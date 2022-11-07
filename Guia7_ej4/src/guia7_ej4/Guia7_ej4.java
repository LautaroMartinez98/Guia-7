

package guia7_ej4;

//@author Usuario

import entidades.Rectangulo;
import servicios.RectanguloServicio;





public class Guia7_ej4 {

    public static void main(String[] args) {
        RectanguloServicio rs = new RectanguloServicio(); // instanciar acciones
        Rectangulo O1 = new Rectangulo();
        rs.crearRectangulo(O1);
        System.out.println("el perimetro es: "+ rs.calcularPerimetro(O1));
        System.out.println("la superficie es: "+ rs.calcularSuperficie(O1));
        rs.dibujarRectangulo(O1);
        
    }

    
    


}
