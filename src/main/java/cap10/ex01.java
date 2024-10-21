package cap10;

import java.util.Locale;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Quantos numeros voce ira digitar? ");
        n = sc.nextInt();

        int[] vetor = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Insira um numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.print("Numeros negativos: ");
        for(int i=0; i<n; i++){
            if(vetor[i] < 0 ){
                System.out.println(vetor[i]);
            }
        }
        sc.close();
    }
}
