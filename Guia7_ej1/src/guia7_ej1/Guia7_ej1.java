

package guia7_ej1;

//@author Usuario

import entidades.Libro;


public class Guia7_ej1 {

    public static void main(String[] args) {
        LibroServicio sl = new LibroServicio();
        Libro L1 = new Libro();
        sl.cargaLibro(L1);
        sl.mostrarLibro(L1);
    }


}
