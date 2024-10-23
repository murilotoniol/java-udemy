package cap10;

import entities.EmployeeCap10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<EmployeeCap10> list = new ArrayList<>();

        // PARTE 1 - ENTRADA DE DADOS

        System.out.println("How many employees will be registered?");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Employee #"+i);

            System.out.print("Id: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            list.add(new EmployeeCap10(id, name, salary));
        }

        // PARTE 2 - ALTERANDO DATA

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        EmployeeCap10 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null){
            System.out.println("This id does not exist");
        }else{
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        // PARTE 3 - LISTAGEM DE EMPREGADOS

        System.out.println("List of employees: ");
        for (EmployeeCap10 obj : list){
            System.out.println(obj);
        }

        sc.close();
    }
}
