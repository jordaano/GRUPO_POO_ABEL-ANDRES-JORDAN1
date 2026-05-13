
package solucionescodigos;

public class Problema3_Empresa {
private String nombre;
    private String ruc;
    private String direccion;

    private Problema3_Departamento departamento1;
    private Problema3_Departamento departamento2;
    private Problema3_Departamento departamento3;

    public Problema3_Empresa(String nombre,
                             String ruc,
                             String direccion,
                             Problema3_Departamento departamento1,
                             Problema3_Departamento departamento2,
                             Problema3_Departamento departamento3) {

        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;

        this.departamento1 = departamento1;
        this.departamento2 = departamento2;
        this.departamento3 = departamento3;
    }

    @Override
    public String toString() {

        return "Empresa: " + nombre +
               "\nRUC: " + ruc +
               "\nDireccion: " + direccion +
               "\n\n--- DEPARTAMENTO 1 ---\n"
               + departamento1.toString()
               + "\n\n--- DEPARTAMENTO 2 ---\n"
               + departamento2.toString()
               + "\n\n--- DEPARTAMENTO 3 ---\n"
               + departamento3.toString();
    }    
}
