//Crear una clase llamada Operacion que tenga como atributos privados numero1 y
//numero2. A continuación, se deben crear los siguientes métodos:
//a) Método constructor con todos los atributos pasados por parámetro.
//b) Metodo constructor sin los atributos pasados por parámetro.
//c) Métodos get y set.
//d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
//los atributos del objeto.
//e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//f) Método restar(): calcular la resta de los números y devolver el resultado al main
//g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
//fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
//no, se hace la multiplicación y se devuelve el resultado al main
//h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
//una división por cero, el método devuelve 0 y se le informa al usuario el error se le
//informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

package guia7_ej3;

//@author Usuario

import entidad.Operacion;


public class Guia7_ej3 {

    public static void main(String[] args) {
      
    }


}
//public Operacion crearOperacion(){
//         Scanner leer = new Scanner(System.in).useDelimiter("\n");
//         System.out.println("Introducir números 1 y 2");
//         int n1=leer.nextInt();
//         int n2=leer.nextInt();
//         return new Operacion(n1,n2);
//User sn = new User();
//        Operacion N = sn.crearOperacion();
//        int n1 = N.getN1();
//        int n2 = N.getN2();
//        System.out.println("la suma de los dos nums " + N.sumar(n1, n2));
//        System.out.println("la resta de los números es de: " + N.restar(n1, n2));
//        System.out.println("La multip de los números es de: " + N.multiplicar(n1, n2));
//        if (N.dividir(n1, n2) != 0) {
//            System.out.println("la división de los números es de: "+N.dividir(n1, n2));
//        }
