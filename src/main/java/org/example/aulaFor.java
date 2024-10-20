package org.example;

import java.util.Locale;
import java.util.Scanner;

public class aulaFor {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            System.out.println("Valor de i é: " + i);
        }

        sc.close();
    }
}