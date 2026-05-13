package solucionescodigos;

public class Problema5_Ejecutor {
public static void ejecutar() {

        Problema5_Evento e1 =
                new Problema5_Evento(
                        "Batalla Norte",
                        "Batalla",
                        "10/05/2026",
                        "Europa",
                        "Conflicto armado",
                        true,
                        60);

        Problema5_Evento e2 =
                new Problema5_Evento(
                        "Reunion ONU",
                        "Diplomatica",
                        "15/05/2026",
                        "USA",
                        "Acuerdo internacional",
                        false,
                        0);

        Problema5_ConflictoInternacional conflicto =
                new Problema5_ConflictoInternacional(
                        "Conflicto Global",
                        "USA, Rusia, China",
                        "01/05/2026",
                        e1,
                        e2);

        System.out.println(conflicto.toString());
    }    
}
