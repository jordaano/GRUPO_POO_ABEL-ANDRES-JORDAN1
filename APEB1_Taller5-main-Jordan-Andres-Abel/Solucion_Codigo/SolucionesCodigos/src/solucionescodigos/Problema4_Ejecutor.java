
package solucionescodigos;


public class Problema4_Ejecutor {
public static void ejecutar() {

        Problema4_PersonaImplicada p1 =
                new Problema4_PersonaImplicada(
                        "Carlos Perez",
                        45,
                        "Juez",
                        "Acusado",
                        true,
                        0.5,
                        100000);

        Problema4_PersonaImplicada p2 =
                new Problema4_PersonaImplicada(
                        "Maria Lopez",
                        30,
                        "Abogada",
                        "Testigo",
                        false,
                        0,
                        0);

        Problema4_CasoCorrupcion caso =
                new Problema4_CasoCorrupcion(
                        "Caso Sobornos",
                        15,
                        "Corrupcion judicial",
                        p1,
                        p2);

        System.out.println(caso.toString());

        p1.verificarBeneficios();
    }    
}
