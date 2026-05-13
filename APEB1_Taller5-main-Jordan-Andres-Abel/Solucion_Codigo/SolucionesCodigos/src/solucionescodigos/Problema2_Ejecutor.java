package solucionescodigos;

import java.util.Scanner;

public class Problema2_Ejecutor {

public static void ejecutar() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nom = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        System.out.print("ACD: ");
        double acd = sc.nextDouble();

        System.out.print("APE: ");
        double ape = sc.nextDouble();

        System.out.print("AA: ");
        double aa = sc.nextDouble();

        Problema2_Materia m =
                new Problema2_Materia("Programacion", acd, ape, aa);

        Problema2_Estudiante e = new Problema2_Estudiante(nom, edad, m);

        System.out.println(e.toString());

        e.verificarAprobacion();
    }    
}
