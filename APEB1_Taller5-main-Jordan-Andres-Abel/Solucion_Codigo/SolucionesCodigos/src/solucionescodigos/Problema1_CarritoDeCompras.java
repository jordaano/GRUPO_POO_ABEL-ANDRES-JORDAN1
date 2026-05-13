package solucionescodigos;

public class Problema1_CarritoDeCompras {

    private Problema1_Producto producto;
    private int cantidadCompra;
    private double descuento;
    
    public Problema1_CarritoDeCompras(double descuento) {
        this.descuento = descuento;
    }
    public void agregarProducto(Problema1_Producto p, int cantidad) {

        if (p != null) {

            if (cantidad <= p.getCantidad()) {

                producto = p;
                cantidadCompra = cantidad;

                System.out.println("Producto agregado");

            } else {
                System.out.println("No hay suficiente stock");
            }

        } else {
            System.out.println("Producto no existe");
        }
    }

    public double calcularTotal() {

        double total = producto.getPrecio() * cantidadCompra;

        if (total > 1000) {
            total = total - (total * descuento / 100);
        }

        return total;
    }

    public void realizarPago(double pago) {

        double total = calcularTotal();

        if (pago >= total) {

            producto.setCantidad(
                    producto.getCantidad() - cantidadCompra);

            System.out.println("Pago realizado");
            System.out.println("Cambio: $" + (pago - total));

        } else {

            System.out.println("Falta pagar: $" + (total - pago));
        }
    }

    public void mostrarDetalleCompra() {

        System.out.println(producto.toString());
        System.out.println("Cantidad comprada: " + cantidadCompra);
        System.out.println("Total: $" + calcularTotal());
    }
}
