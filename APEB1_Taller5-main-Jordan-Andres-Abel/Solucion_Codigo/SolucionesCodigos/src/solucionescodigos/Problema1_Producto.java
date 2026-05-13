package solucionescodigos;

public class Problema1_Producto {
    
    private int cantidad;
    private double precio;
    private String nombre;

    public Problema1_Producto(int cantidad, double precio, String nombre) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "Producto: " + nombre +
               "\nPrecio: $" + precio +
               "\nCantidad disponible: " + cantidad;
    }
}
