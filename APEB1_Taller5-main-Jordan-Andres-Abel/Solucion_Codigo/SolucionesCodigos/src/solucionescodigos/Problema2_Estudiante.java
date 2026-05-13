package solucionescodigos;

public class Problema2_Estudiante {
    private String nombre;
    private int edad;
    private Problema2_Materia materia;

    public Problema2_Estudiante(String nombre, int edad,
            Problema2_Materia materia) {

        this.nombre = nombre;
        this.edad = edad;
        this.materia = materia;
    }

    public void verificarAprobacion() {

        if (materia.aprobar()) {

            System.out.println("Estudiante aprobado");

        } else {

            double recuperacion =
                    7 - (materia.calcularNota() * 0.60);

            System.out.println(
                    "Debe rendir recuperación: "
                    + recuperacion);
        }
    }

    @Override
    public String toString() {

        return "Nombre: " + nombre +
               "\nEdad: " + edad +
               "\n" + materia.toString();
    }    
}
