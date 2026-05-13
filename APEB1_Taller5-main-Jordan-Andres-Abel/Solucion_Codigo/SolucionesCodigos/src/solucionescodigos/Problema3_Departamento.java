package solucionescodigos;

public class Problema3_Departamento {

 private String nombre;
    private int numeroEmpleados;
    private double produccionAnual;
    private String categoria;

    public Problema3_Departamento(String nombre,
                                  int numeroEmpleados,
                                  double produccionAnual) {

        this.nombre = nombre;
        this.numeroEmpleados = numeroEmpleados;
        this.produccionAnual = produccionAnual;

        determinarCategoria();
    }

    public void determinarCategoria() {

        if (numeroEmpleados > 20 &&
                produccionAnual > 1000000) {

            categoria = "A";

        } else if (numeroEmpleados >= 20 &&
                produccionAnual >= 1000000) {

            categoria = "B";

        } else if (numeroEmpleados >= 10 &&
                produccionAnual >= 500000) {

            categoria = "C";

        } else {

            categoria = "Sin categoria";
        }
    }

    @Override
    public String toString() {

        return "Departamento: " + nombre +
               "\nNumero empleados: " + numeroEmpleados +
               "\nProduccion anual: $" + produccionAnual +
               "\nCategoria: " + categoria;
    }    
}
