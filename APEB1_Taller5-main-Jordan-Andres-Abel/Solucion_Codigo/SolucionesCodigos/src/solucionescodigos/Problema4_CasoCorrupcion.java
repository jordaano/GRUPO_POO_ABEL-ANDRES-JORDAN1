
package solucionescodigos;


public class Problema4_CasoCorrupcion {
private String nombreCaso;
    private int dias;
    private String estado;
    private String detalle;

    private Problema4_PersonaImplicada persona1;
    private Problema4_PersonaImplicada persona2;

    public Problema4_CasoCorrupcion(
            String nombreCaso,
            int dias,
            String detalle,
            Problema4_PersonaImplicada persona1,
            Problema4_PersonaImplicada persona2) {

        this.nombreCaso = nombreCaso;
        this.dias = dias;
        this.detalle = detalle;

        this.persona1 = persona1;
        this.persona2 = persona2;

        actualizarEstado();
    }

    public void actualizarEstado() {

        if (dias > 14) {

            estado = "Urgente";

        } else if (dias > 7) {

            estado = "Alerta";

        } else {

            estado = "Iniciado";
        }
    }

    @Override
    public String toString() {

        return "Caso: " + nombreCaso +
               "\nEstado: " + estado +
               "\nDetalle: " + detalle +
               "\n\n--- PERSONA 1 ---\n"
               + persona1.toString()
               + "\n\n--- PERSONA 2 ---\n"
               + persona2.toString();
    }    
}
