package com.mycompany.tasca2prgramacion;
public class javaapplication3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Taula de multiplicar del " + i + ":");
            for (int j = 1; j <= 10; j++) {
                int resultat = i * j;
                System.out.println(i + " * " + j + " = " + resultat);
            }
            System.out.println(); // Línia en blanc entre taules
        }
    }
}