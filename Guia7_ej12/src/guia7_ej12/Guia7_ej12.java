//Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
//(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
//métodos:

package guia7_ej12;

//@author Usuario

import Entidad.Persona;
import Servicios.PersonaService;


public class Guia7_ej12 {

    public static void main(String[] args) {
        PersonaService ps = new PersonaService();
        Persona p1 = new Persona();
        ps.crearPersona(p1);
        ps.calcularEdad(p1);
    }


}
