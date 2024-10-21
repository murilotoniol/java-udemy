package org.example;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaDoWhile {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double temp, tempConvertida;
        char opcao;

        do{
            System.out.println("Digite uma temperatura em Celsius: ");
            temp = sc.nextDouble();
            tempConvertida = (9.0 * temp)/5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.2f%n", tempConvertida);
            System.out.println("Deseja continuar? (S/N)");
            opcao = sc.next().charAt(0);

        }while(opcao != 'N');

        sc.close();
    }
}