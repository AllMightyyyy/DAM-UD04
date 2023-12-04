public class SavingsAccount extends Account {
    private double varInterest;
    private static final double minBalance = 500.0;
    public SavingsAccount() {
        super();

    }
    public SavingsAccount(long accountNumber, Person client) {
        super(accountNumber, client);
    }

    public SavingsAccount(long accountNumber, Person client, double balance) {
        super(accountNumber, client, balance);
    }

    @Override
    void withdraw(double withdrawAmount) {
        if(this.getBalance() > minBalance) {
            this.setBalance(this.getBalance() - withdrawAmount);
            System.out.println("Withdraw of the amount " + withdrawAmount + " has been done successfully");
        } else {
            System.out.println("insufficient funds, your balance is just " + this.getBalance());
        }

    }

    @Override
    void updateBalance() {
        this.setBalance(this.getBalance() + (this.getBalance() * varInterest));
        System.out.println("Balance has been updated according to the variable interest rate " + varInterest);
    }
    void updateInterest(double newInterest) {
        this.setBalance(newInterest);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accountNumber=" + this.getAccountNumber() +
                ", balance=" + this.getBalance() +
                ", client=" + this.getClient() +
                ", interest=" + varInterest + '}';
    }
}
