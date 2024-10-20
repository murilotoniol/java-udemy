package org.example;

import java.util.Locale;
import java.util.Scanner;

public class exWhile {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int opcao = 0, alcool = 0, gasolina = 0, diesel = 0;

        while(opcao != 4){

            System.out.print("Digite qual a sua preferencia pelos nossos produtos (1- alcool; 2- gasolina; 3- diesel; 4- Encerrar): ");
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
                case 4:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }

        System.out.print("MUITO OBRIGADO" +
                "\nAlcool: " + alcool +
                "\nGasolina: " + gasolina +
                "\nDiesel: " + diesel
                );

        sc.close();
    }
}