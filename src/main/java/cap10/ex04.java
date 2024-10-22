package cap10;

import java.util.Locale;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();
        double[] elementos = new double[n];

        for (int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            elementos[i] = sc.nextDouble();
        }
        double soma=0, media;
        for (int i=0; i<n; i++){
            soma += elementos[i];
        }

        media = soma/n;
        int contagem = 0;

        System.out.printf("Media do vetor: %.3f%n", media);
        System.out.println("Elementos abaixo da media:");

        for (int i=0; i<n; i++){
            if(elementos[i] < media){
                System.out.println(elementos[i]);
            }
        }

        sc.close();
    }
}
