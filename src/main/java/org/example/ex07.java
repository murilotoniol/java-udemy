package org.example;

import java.util.Locale;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n < 0){
            System.out.print("Negativo");
        }else{
            System.out.print("Não negativo");
        }

        sc.close();
    }
}
