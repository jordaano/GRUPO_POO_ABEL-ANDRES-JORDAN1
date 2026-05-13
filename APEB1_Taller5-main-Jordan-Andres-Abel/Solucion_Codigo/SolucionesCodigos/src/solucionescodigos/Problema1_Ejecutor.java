
package solucionescodigos;
import java.util.Scanner;

public class Problema1_Ejecutor {
    public static void ejecutar() {
    
    Scanner sc = new Scanner(System.in);
    Problema1_Producto p1 = new Problema1_Producto(1,200,"Laptop");
    Problema1_CarritoDeCompras carrito =
                new Problema1_CarritoDeCompras(10);
    System.out.print("Cantidad a comprar: ");
        int cant = sc.nextInt();

        carrito.agregarProducto(p1, cant);

        carrito.mostrarDetalleCompra();

        System.out.print("Ingrese pago: ");
        double pago = sc.nextDouble();

        carrito.realizarPago(pago);
    
    }
    
}
