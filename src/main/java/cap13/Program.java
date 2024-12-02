package cap13;

import entities.Accountcap13;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.text.ParseException;

public class Program {
    public static void main(String[] args) throws ParseException {
        /*Accountcap13 acc = new Accountcap13(1001, "Alex", 0.0);
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
        }*/

        Accountcap13 acc1 = new Accountcap13(1001, "Alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Accountcap13 acc2 = new SavingsAccount(1002, "Murilo", 1000.0, 5000.0);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Accountcap13 acc3 = new BusinessAccount(1003, "Murilo", 1000.0, 5000.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
    }
}
