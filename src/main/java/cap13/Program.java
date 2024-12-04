package cap13;

import entities.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*
        Accountcap13 acc = new Accountcap13(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING

        Accountcap13 acc1 = bacc;
        Accountcap13 acc2 = new BusinessAccount(1003, "Murilo", 10000.0, 12000.0);
        Accountcap13 acc3 = new SavingsAccount(1004, "Murilo Besson", 2100.0, 3000.0);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);

        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount){
         SavingsAccount acc5 = (SavingsAccount) acc3;
         acc5.updateBalance();
         System.out.println("Updated!");
        }
        */

        // AULA 133
        /*
        Accountcap13 acc1 = new Accountcap13(1001, "Alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Accountcap13 acc2 = new SavingsAccount(1002, "Murilo", 1000.0, 5000.0);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Accountcap13 acc3 = new BusinessAccount(1003, "Murilo", 1000.0, 5000.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
         */

        // AULA 135
        List<EmployeeCap13> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int empNumb = sc.nextInt();

        for (int i=1; i<=empNumb; i++){
            System.out.println("Employee #"+i+" data:");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (ch == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                list.add(new OutsourcedEmployeeCap13(hours, name, valuePerHour, additionalCharge));
            }else{
                list.add(new EmployeeCap13(hours, name, valuePerHour));
            }
        }

        System.out.println("PAYMENTS:");
        for (EmployeeCap13 emp : list){
            System.out.println(emp.getName() + " $" + emp.payment());
        }
    }
}
