package org.example;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a, b, c, d;
        double diferenca;
        System.out.println("Digite quatro numeros: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        diferenca =(double) (a * b) - (c * d);
        System.out.println("A diferenca é: " + diferenca);

        sc.close();
    }
}