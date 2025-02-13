package entities;

public class BusinessAccount extends Account {

    private Double loadLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(int number, String holder, double balance, Double loadLimit) {
        super(number, holder, balance);
        this.loadLimit = loadLimit;
    }

    public Double getLoadLimit() {
        return loadLimit;
    }

    public void setLoadLimit(Double loadLimit) {
        this.loadLimit = loadLimit;
    }

    public void loan(double amount) {
        if(amount <= loadLimit) {
            balance += amount - 10.0;
        }
    }

    @Override
    //O "Super" também serce como método de sobreposicao chamando métodos de outra classe e alterando
    public void withdraw (double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
}
