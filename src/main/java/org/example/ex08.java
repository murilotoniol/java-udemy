package org.example;

import java.util.Locale;
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n % 2 == 0){
            System.out.print("Par");
        }else{
            System.out.print("Impar");
        }

        sc.close();
    }
}
