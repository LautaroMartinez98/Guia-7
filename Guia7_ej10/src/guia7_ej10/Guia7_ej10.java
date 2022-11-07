

package guia7_ej10;

//@author Usuario

import java.util.Arrays;


public class Guia7_ej10 {

    public static void main(String[] args) {
        double[] A = new double[50];
        double[] B = new double[20];
        for (int i = 0; i < 50; i++) {
            double num = (Math.random() * 50);
            A[i] = ((Math.round(num * 100.0) / 100.0));

        }
        for (double i : A) {
            System.out.print("[" + i + "]");
        }
        Arrays.sort(A);
        
        System.out.println("\n"+"el vector ordenado es: ");
        for (double i : A) {
            System.out.print("[" + i + "]");
        }
        for (int i = 0; i < 10; i++) {
            B[i]=A[i];
        }
        for (int i = 10; i < 20; i++) {
            B[i]=0.5;
        }
        
        System.out.println("\n"+"el vector B es:");
        for(double i:B){
            System.out.print("["+i+"]");}

    }


}
