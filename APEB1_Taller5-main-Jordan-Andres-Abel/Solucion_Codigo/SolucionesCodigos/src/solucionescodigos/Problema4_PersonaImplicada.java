
package solucionescodigos;

public class Problema4_PersonaImplicada {
private String nombre;
    private int edad;
    private String ocupacion;
    private String nivelImplicacion;

    private boolean colabora;
    private double sentencia;
    private double danioEstado;

    public Problema4_PersonaImplicada(String nombre,
                                      int edad,
                                      String ocupacion,
                                      String nivelImplicacion,
                                      boolean colabora,
                                      double sentencia,
                                      double danioEstado) {

        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.nivelImplicacion = nivelImplicacion;

        this.colabora = colabora;
        this.sentencia = sentencia;
        this.danioEstado = danioEstado;
    }

    public void verificarBeneficios() {

        if (nivelImplicacion.equalsIgnoreCase("acusado")
                && colabora) {

            System.out.println(
                    nombre +
                    " puede acceder a reduccion de pena");

            if (sentencia < 1) {

                double fianza = danioEstado * 0.50;

                System.out.println(
                        "Puede pagar fianza de: $" +
                        fianza);
            }
        }
    }

    @Override
    public String toString() {

        return "Nombre: " + nombre +
               "\nEdad: " + edad +
               "\nOcupacion: " + ocupacion +
               "\nNivel implicacion: " +
               nivelImplicacion;
    }    
}
