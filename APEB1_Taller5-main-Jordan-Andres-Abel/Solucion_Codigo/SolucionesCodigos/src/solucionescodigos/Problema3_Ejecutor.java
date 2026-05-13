
package solucionescodigos;


public class Problema3_Ejecutor {
public static void ejecutar() {

        Problema3_Departamento d1 =
                new Problema3_Departamento(
                        "Finanzas", 25, 2000000);

        Problema3_Departamento d2 =
                new Problema3_Departamento(
                        "Ventas", 20, 1000000);

        Problema3_Departamento d3 =
                new Problema3_Departamento(
                        "Marketing", 10, 600000);

        Problema3_Empresa empresa =
                new Problema3_Empresa(
                        "Tech Solutions",
                        "1102345678001",
                        "Loja",
                        d1, d2, d3);

        System.out.println(empresa.toString());
    }    
}
