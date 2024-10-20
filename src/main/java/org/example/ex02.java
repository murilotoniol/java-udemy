package org.example;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, area, pi = 3.14159;

        System.out.println("Digite o valor do raio de um circulo:");
        raio = sc.nextDouble();
        area = pi * raio * raio;
        System.out.printf("A area do circulo é igual a: %.4f", area);

        
        sc.close();
    }
}
