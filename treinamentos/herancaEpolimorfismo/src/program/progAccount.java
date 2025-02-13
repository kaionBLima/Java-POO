package program;
import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class progAccount {

    public void main (String[] args) {

        Account acc = new Account(1001,"Alex", 0.0);
        BusinessAccount abc = new BusinessAccount(1002, "Maria", 0.0, 500.00);

        //Upcasting -> Converte um objeto da subclasse para superclasse
        Account acc1 = abc;
        Account acc2 = new BusinessAccount(1003, "João", 0.0, 40.00);
        Account acc3 = new SavingsAccount(1004, "Eduarda", 0.0, 0.01);

         /*DownCasting -> Converte um objeto da superclasse para subclasse
         BusinessAccount acc4 = new Account(); -> Não dá para fazer uma conversão de objeto de classe filho para classe pai, dá erro
         Para fazer isso é de outra maneira havendo uma instancia feita anteriomente como feita no acc2 recebendo o tipo BuninessAccount */

        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.00); // Operação de emprestimo

        /* BusinessAccount acc5 = (BusinessAccount)acc2; -> Não dá certo porque a variavel acc2 é Account. Logo:
        Testando e fazendo DownCasting dar certo: */

        if(acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(150.00);
            System.out.println("Emprestado!");
        }

        if(acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
