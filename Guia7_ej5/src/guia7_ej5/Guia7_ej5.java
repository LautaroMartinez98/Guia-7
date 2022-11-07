//Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
//numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
//Las operaciones asociadas a dicha clase son:
//a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
//b) Agregar los métodos getters y setters correspondientes
//c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
//d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
//y se la sumara a saldo actual.
//e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
//restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
//saldo actual en 0.
//f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
//usuario no saque más del 20%.
//g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
package guia7_ej5;

//@author Usuario
import Entidad.Cuenta;
import Servicio.CuentaService;
import java.util.Scanner;

public class Guia7_ej5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaService Cs = new CuentaService();
        Cuenta c1 = new Cuenta();
        Cs.crearCuenta(c1);
        int opc;
        do {
            System.out.println("MENU\n"
                    + "1. ingresar dinero\n"
                    + "2. retirar dinero\n"
                    + "3. extraccion rapida\n"
                    + "4. consultar saldo\n"
                    + "5. consultar datos\n"
                    + "6. salir\n"
                    + "Elija opción:");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    Cs.ingresar(c1);
                    break;
                case 2:
                    Cs.retirar(c1);
                    break;
                case 3:
                    Cs.extraccionRapida(c1);
                    break;
                case 4:
                    Cs.consultarSaldo(c1);
                    break;
                case 5:
                    System.out.println(c1.toString());
                    break;

                default: 
                    if (opc != 6) {
                    System.out.println("numero invalido");
                    }
            }
        } while (opc != 6);

    }

}
