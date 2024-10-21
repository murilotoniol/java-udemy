package introducaoPOO;


import entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class calculoBoletim {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            Student std = new Student();

            System.out.println("Name:");
            std.name = sc.nextLine();
            System.out.println("Digite as notas:");
            std.n1 = sc.nextDouble();
            std.n2 = sc.nextDouble();
            std.n3 = sc.nextDouble();

            System.out.println("Final grade: "+std.notaFinal());
            if (std.notaFinal() < 60){
                System.out.println("FAILED");
                System.out.println("Missing points: "+std.missingPoints());
            }else{
                System.out.println("PASS");
            }
            sc.close();
        }
}
