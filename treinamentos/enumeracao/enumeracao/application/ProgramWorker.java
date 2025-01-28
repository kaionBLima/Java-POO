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

        System.out.print("Entre com o nome do departamento: ");
        String departamentName = sc.nextLine();
        System.out.print("Entre com os dados do trabalhador: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departamentName));

        System.out.print("Quantos contratos este trabalhador tem? ");
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
            worker.addContract(contract);
        }
        sc.close();
    }
}
