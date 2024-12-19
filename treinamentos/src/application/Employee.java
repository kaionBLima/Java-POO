package application;

import entities.employeeList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Employee {

    public static void main(String[] arg) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<employeeList> list = new ArrayList<>();

        System.out.println("Quantos funcionários queres registrar?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Funcionário: #" + i + ": ");

            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)) { //Verificar se o ID já existe ou na Lista
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            list.add(new employeeList(id, name, salary));
        }

        //aumento de salário
        System.out.println();
        System.out.print("Digite o Id do funcionário que terá aumento: ");
        int id = sc.nextInt();
        employeeList emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("Este Id não funciona!");
        }
        else {
            System.out.print("Digite a porcentagem de aumento: ");
            double percentage = sc.nextDouble();
            emp.aumentoSalary(percentage);
        }

        System.out.println();
        System.out.println("Lista de funcionários: ");
        for (employeeList obj : list) {
            System.out.println(obj);
        }

        sc.close();

    }

    public static boolean hasId(List<employeeList> list, int id){
        employeeList emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}

