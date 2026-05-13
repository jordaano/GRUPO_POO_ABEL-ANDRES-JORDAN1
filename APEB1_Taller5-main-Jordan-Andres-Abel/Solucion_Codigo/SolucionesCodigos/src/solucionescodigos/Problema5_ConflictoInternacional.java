package solucionescodigos;


public class Problema5_ConflictoInternacional {
private String nombre;
    private String paises;
    private String fechaInicio;
    private String estadoActual;

    private Problema5_Evento evento1;
    private Problema5_Evento evento2;

    public Problema5_ConflictoInternacional(
            String nombre,
            String paises,
            String fechaInicio,
            Problema5_Evento evento1,
            Problema5_Evento evento2) {

        this.nombre = nombre;
        this.paises = paises;
        this.fechaInicio = fechaInicio;

        this.evento1 = evento1;
        this.evento2 = evento2;

        verificarEstado();
    }

    public void verificarEstado() {

        if (evento1.getTipo().equalsIgnoreCase("Batalla")
                && evento1.isArmasNucleares()) {

            estadoActual = "Guerra Mundial";

        } else if (evento1.getPorcentajeBajas() >= 50) {

            estadoActual =
                    "ONU convocada urgentemente";

        } else {

            estadoActual = "Conflicto activo";
        }
    }

    @Override
    public String toString() {

        return "Conflicto: " + nombre +
               "\nPaises involucrados: " + paises +
               "\nFecha inicio: " + fechaInicio +
               "\nEstado actual: " + estadoActual +
               "\n\n--- EVENTO 1 ---\n"
               + evento1.toString()
               + "\n\n--- EVENTO 2 ---\n"
               + evento2.toString();
    }    
}
