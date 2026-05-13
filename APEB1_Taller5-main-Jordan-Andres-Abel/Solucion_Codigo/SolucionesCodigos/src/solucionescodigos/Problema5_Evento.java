
package solucionescodigos;

public class Problema5_Evento {
 private String nombreEvento;
    private String tipo;
    private String fecha;
    private String ubicacion;
    private String descripcion;

    private boolean armasNucleares;
    private double porcentajeBajas;

    public Problema5_Evento(String nombreEvento,
                            String tipo,
                            String fecha,
                            String ubicacion,
                            String descripcion,
                            boolean armasNucleares,
                            double porcentajeBajas) {

        this.nombreEvento = nombreEvento;
        this.tipo = tipo;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;

        this.armasNucleares = armasNucleares;
        this.porcentajeBajas = porcentajeBajas;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isArmasNucleares() {
        return armasNucleares;
    }

    public double getPorcentajeBajas() {
        return porcentajeBajas;
    }

    @Override
    public String toString() {

        return "Evento: " + nombreEvento +
               "\nTipo: " + tipo +
               "\nFecha: " + fecha +
               "\nUbicacion: " + ubicacion +
               "\nDescripcion: " + descripcion;
    }    
}
