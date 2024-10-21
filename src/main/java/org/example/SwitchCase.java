package org.example;

import java.util.Locale;
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um dia da semana:");
        int x = sc.nextInt();
        String dia = "";

        switch (x){
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terça";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sábado";
                break;
            default:
                System.out.print("Valor inválido");
                break;
        }

        System.out.println(dia);
        sc.close();
    }
}