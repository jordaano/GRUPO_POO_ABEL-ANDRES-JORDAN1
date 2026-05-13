package solucionescodigos;

public class Problema2_Materia {

    private String nombre;
    private double acd;
    private double ape;
    private double aa;

    public Problema2_Materia(String nombre, double acd, double ape, double aa) {

        this.nombre = nombre;
        this.acd = acd;
        this.ape = ape;
        this.aa = aa;
    }

    public double calcularNota() {
        return acd + ape + aa;
    }

    public boolean aprobar() {
        return calcularNota() >= 7;
    }

    @Override
    public String toString() {

        return "Materia: " + nombre +
               "\nNota final: " + calcularNota();
    }

    
}
