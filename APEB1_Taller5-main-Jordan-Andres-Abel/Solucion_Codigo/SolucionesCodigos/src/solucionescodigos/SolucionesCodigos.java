package solucionescodigos;

import java.util.Scanner;

public class SolucionesCodigos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;
        System.out.println("Integrantes de tarea grupal:");
        System.out.println("Jordan Lopez");
        System.out.println("Andres Fernandez");
        System.out.println("Abel Valle");
        do {
            

            System.out.println("\n===== MENU =====");
            System.out.println("1. Problema 1");
            System.out.println("2. Problema 2");
            System.out.println("3. Problema 3");
            System.out.println("4. Problema 4");
            System.out.println("5. Problema 5");
            System.out.println("0. Salir");

            System.out.print("Seleccione: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    Problema1_Ejecutor.ejecutar();
                    break;

                case 2:

                    Problema2_Ejecutor.ejecutar();
                    break;

                case 3:

                    Problema3_Ejecutor.ejecutar();
                    break;

                case 4:

                    Problema4_Ejecutor.ejecutar();
                    break;

                case 5:

                    Problema5_Ejecutor.ejecutar();
                    break;

                case 0:

                    System.out.println("Fin del programa");
                    break;

                default:

                    System.out.println("Opcion incorrecta");
            }

        } while (opcion != 0);

    }
}
