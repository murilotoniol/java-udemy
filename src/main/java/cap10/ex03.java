package cap10;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantas pessoas serão digitadas: ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i=0; i<n; i++){
            System.out.println("Dados da "+(i+1)+"a pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }
        double soma = 0.0;
        int contagem = 0;
        for (int i=0; i<n; i++){
            soma += alturas[i];
            if (idades[i]<16){
                contagem += 1;
            }
        }

        double mediaAltura = soma/n;
        double porcentagem = (contagem * 100)/n;

        System.out.printf("Altura media: %.2f%n", mediaAltura);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);

        for (int i=0; i<n; i++){
            if (idades[i]<16){
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
