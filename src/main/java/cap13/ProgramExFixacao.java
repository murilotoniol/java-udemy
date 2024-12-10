package cap13;

import cap13.entities.Company;
import cap13.entities.Individual;
import cap13.entities.TaxPayer;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramExFixacao {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list= new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.print("Enter the number of tax payers: ");
            System.out.print("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual Income: ");
            double income = sc.nextDouble();
            if (type == 'i'){
                System.out.print("Health Expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, income, healthExpenditures));
            }else{
                System.out.print("Number of employees: ");
                int numEmployees = sc.nextInt();
                list.add(new Company(name, income, numEmployees));
            }
        }

        double sum = 0.0;
        System.out.println("TAXES PAID:");
        for (TaxPayer tp : list){
            double tax = tp.tax();
            System.out.println(tp.getName() + ": $" + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));
        sc.close();
    }
}
