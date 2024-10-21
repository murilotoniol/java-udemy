package org.example;

import java.util.Locale;
import java.util.Scanner;

public class aula38 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos;
        double conta;

        System.out.println("Digite a quantidade de minutos:");
        minutos = sc.nextInt();
        conta = 50.0;

        if (minutos > 100){
            conta += (minutos - 100) * 2;
        }

        System.out.println(conta);
        sc.close();
    }
}