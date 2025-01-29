package application;

import entities.enums.WorkerLevel;
import entitiess.Department;
import entitiess.HourContract;
import entitiess.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramWorker {

    public static void main (String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com o nome do departamento: ");
        String departamentName = sc.nextLine();
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departamentName));

        System.out.println("Quantos contratos este trabalhador tem? ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println("Entre com o contrato #" + i);
            System.out.print("Date (DD/MM/YYYY: ");
            Date contracDate =sdf1.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration(hour): ");
            int hour = sc.nextInt();
            HourContract contract = new HourContract(contracDate, valuePerHour, hour);
            worker.addContract(contract); //Associando contratos com os trabalhadores
        }

        System.out.println();
        System.out.print("Entre com o mês e ano para calcular a renda (MM/YYYY): ");
        String monthAndYear = sc.next();
        //Pegando os caracteres, convertendo-os para inteiro e guardando em uma variável mês(MM) e ano(YYYY)
        int month = Integer.parseInt(monthAndYear.substring(0,2)); // Convertendo mês
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));



        sc.close();
    }
}
