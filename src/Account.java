/**
 * Created by red6 on 4/12/2017.
 */
public class Account {
    int id;
    int balance;

    public int getBalance() {
        return balance;
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
