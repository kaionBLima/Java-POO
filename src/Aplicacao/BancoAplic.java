package Aplicacao;

public class BancoAplic {

    private int number; //Numero da conta
    private String holder; //Titular
    private double balance; //Saldo inicial

    public BancoAplic(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public BancoAplic(int number, String holder, double inicialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(inicialDeposit);
    }

    //o numero e o saldo da conta não irão ficar mudando


    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {   //amount -> quantia
        balance += amount;
    }

    public void withdraw(double amount) { //Saque
        balance -= amount + 5.0;
    }

    public String toString() {
        return "Conta "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }

}