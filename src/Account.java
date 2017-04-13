/**
 * Created by red6 on 4/12/2017.
 */
public class Account {
    private int id;
    private int balance;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;

    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int x) {
        int newBal = balance + x;
        this.balance = newBal;
    }

    public void withdraw(int x) {
    if (balance >= x) {
        int newBal = balance - x;
        this.balance = newBal;
    }
    else {
        System.out.println("Impossible to made deposit");
    }
    }
}
