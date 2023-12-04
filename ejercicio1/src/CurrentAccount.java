public class CurrentAccount extends Account {
    private final double interest = 0.015;
    public CurrentAccount() {
        super();
    }
    public CurrentAccount(long accountNumber, Person client) {
        super(accountNumber, client);
    }

    public CurrentAccount(long accountNumber, Person client, double balance) {
        super(accountNumber, client, balance);
    }

    @Override
    void withdraw(double withdrawAmount) {
        if(this.getBalance() > withdrawAmount) {
            this.setBalance(this.getBalance() - withdrawAmount);
            System.out.println("Money withdrawn succesffully, amount withdrawn is " + withdrawAmount);
        } else {
            System.out.println("Not enough Money in your account");
        }
    }

    @Override
    void updateBalance() {
        this.setBalance(this.getBalance() + (this.getBalance() * interest) );
        System.out.println("Interest Rate has been applied");
    }


    @Override
    public String toString() {
        return "CurrentAccount{" +
                "accountNumber=" + this.getAccountNumber() +
                ", balance=" + this.getBalance() +
                ", client=" + this.getClient() +
                ", interest=" + interest + '}';
    }
}
