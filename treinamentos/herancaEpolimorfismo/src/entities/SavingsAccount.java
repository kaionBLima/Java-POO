package entities;

import java.util.function.DoubleToIntFunction;

//Esse "final" evita que a classe seja herdada e se usado em um método, evita que ele seja sobreposto
public final class SavingsAccount  extends Account{

    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int number, String holder, double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    //Sobrescrita de método alterando algumas caracteristicas
    @Override
    public void withdraw (double amount) {
        balance += amount;
    }
}
