package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;

public class ejercicio2 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double precioUnidad, cantidadProd, iva, precioSinIva, totalIva;

        System.out.print("Introduzca el precio por unidad del producto: ");
        precioUnidad = sc.nextDouble();
        System.out.print("Introduzca la cantidad de productos vendidos: ");
        cantidadProd = sc.nextDouble();
        System.out.print("Introduzca el %IVA: ");
        iva = sc.nextDouble();

        precioSinIva = precioUnidad * cantidadProd;
        totalIva = precioSinIva * iva / 100;

        System.out.println("Precio de la venta: " + (precioSinIva + totalIva));

    }
}
