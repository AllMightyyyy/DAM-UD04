public abstract class Account {
    private long accountNumber;
    private double balance;
    private Person client;
    public Account() {
        this.accountNumber = 0;
        this.balance = 0;
        this.client = new Person();
    }
    public Account(long accountNumber, Person client) {
        this.accountNumber = accountNumber;
        this.client = client;
    }
    public Account(long accountNumber, Person client, double balance) {
        this.accountNumber = accountNumber;
        this.client = client;
        this.balance = balance;
    }
    public void setBalance(double balance) {
        if(balance > 0) {
            this.balance = balance;
            System.out.println("Balance has been set to " + balance);
        } else {
            System.out.println("Invalid balance amount");
        }
    }
    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Person getClient() {
        return client;
    }
    public void deposit(double depAmount) {
        if(depAmount > 0) {
            this.setBalance(this.getBalance() + depAmount);
            System.out.println("Amount " + depAmount + " has been deposited");
        } else {
            System.out.println("Invalid deposit Amount");
        }
    }
    abstract void withdraw(double withdrawAmount);
    abstract void updateBalance();

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", client=" + client +
                '}';
    }
}
