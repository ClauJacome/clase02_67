package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N, m;

        System.out.print("Introduzca el valor de N: ");
        N = sc.nextInt();
        System.out.print("Introduzca el valor de m:");
        m = sc.nextInt();

        N = N / (int) Math.pow(10, m);

        System.out.println("Numero modificado: " + N);

    }
    
}
