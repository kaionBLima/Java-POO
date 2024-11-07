package Execucao;

import java.util.Scanner;
import java.util.Locale;
import Aplicacao.BancoAplic;

public class Banco {

    public static void main(String[] args) {

        BancoAplic conta;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o número da conta: ");
        int number = sc.nextInt();
        System.out.print("Entre com o titular da conta: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Tem deposito inicial (Y/N)? ");
        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.print("Entre com um deposito inicial: ");
            double initialDeposit = sc.nextDouble();
            conta = new BancoAplic(number, holder, initialDeposit);
        }
        else {
            conta = new BancoAplic(number, holder);
        }

        System.out.println();
        System.out.println("Info da Conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Valor do deposito: ");
        double depositValue = sc.nextDouble();
        conta.deposit(depositValue);
        System.out.println("Info da Conta atualizada: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Valor de saque: ");
        double withdrawValue = sc.nextDouble();
        conta.withdraw(withdrawValue);
        System.out.println("Info da Conta atualizada: ");
        System.out.println(conta);

        sc.close();
    }
}