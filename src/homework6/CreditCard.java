package homework6;

public class CreditCard {
    String name;
    int accountNumber;
    double balance;

    public CreditCard(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void topUp(double x) {
        balance += x;
    }

    public void withdraw(double x) {
        balance -= x;
    }

    public String toString() {
        return "Name card: " + " \"" + name + "\"  Account number : " + accountNumber + "  Balance = " + balance;
    }
}
