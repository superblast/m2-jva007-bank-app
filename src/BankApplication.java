/**
 * Created by red6 on 4/12/2017.
 */
public class BankApplication {

    public static void main(String[] args) {
        System.out.println("Bank app starts");
        Client client1 = Bank.addClient("Name1", Gender.FEMALE);
        client1.setUpAccount();
        System.out.println("Client name: " + client1.getName()+  " Gender: " + client1.getGender());
        System.out.println("Acc ID: " + client1.getAccount().getBalance() + " Balance: " + client1.getAccount().getBalance());


    }
    public void printBalance() {
        System.out.println("Print balance");
    }

}
