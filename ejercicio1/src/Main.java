// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        Defines an abstract class. It has the following attributes:
        • countnumber: long integer
        • balance : double
        • client: attribute of the Person class
        (which has a first and last name, and NIF).
        And with the following methods:
        • Parameterized constructor that receives a
        customer and an account number
        • Accessors for the three attributes
        • enter(double): it will allow you to enter an amount into the account.
        • abstract withdraw(double): will allow you to
        withdraw an amount from the account (if there is a balance).
        Not implemented, depends on account type
        • updateBalance(): will update the account balance,
        but each account does it differently.
        Defines the Account subclasses described below:
        • Current Account: Normal account with a fixed interest
        of 1.5%. Include parameterized constructor and toString() method.
        • Savings Account: This account has the attributes of
        variable interest throughout the year and a minimum necessary
        balance. When withdrawing money, you must take into account
        that the minimum balance is not exceeded. Include parameterized
        constructor, toString() method and method to change interest.
        Create a program that creates multiple accounts and tests the features.
         */

        Person person = new Person("John", "Doe", "123456789");

        CurrentAccount currentAccount = new CurrentAccount(1001, person, 1000.0);

        currentAccount.deposit(500.0);

        currentAccount.withdraw(200.0);

        System.out.println("Current Account Details:");
        System.out.println(currentAccount);

        SavingsAccount savingsAccount = new SavingsAccount(2001, person, 1500.0);

        savingsAccount.updateInterest(0.02);

        savingsAccount.withdraw(300.0);

        savingsAccount.updateBalance();

        System.out.println("\nSavings Account Details:");
        System.out.println(savingsAccount);
    }
}

