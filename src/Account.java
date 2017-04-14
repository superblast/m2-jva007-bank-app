/**
 * Created by red6 on 4/12/2017.
 */
public class Account {
    private int id;
    private double balance;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double x) {
        double newBal = balance + x;
        this.balance = newBal;
    }

    public void withdraw(double x) {
    if (balance >= x) {
        double newBal = balance - x;
        this.balance = newBal;
    }
    else {
        System.out.println("Impossible to made deposit");
    }
    }
}
