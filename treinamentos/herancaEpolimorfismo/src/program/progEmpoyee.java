package program;

import entities.EmpoyeeTerc;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class progEmpoyee {

    public static void main () {

        Scanner sc = new Scanner(System.in);

        List <EmpoyeeTerc> list = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++) {
            System.out.println("Employee #" + i +    " data:");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hours: ");
            double vph = sc.nextDouble();

            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, vph, additionalCharge));
            }
            else {
                list.add(new EmpoyeeTerc(name, hours, vph));
            }
        }

        System.out.println();
        System.out.println("Payment: ");
        for (EmpoyeeTerc emp : list) {
            System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}
