/**
 * Created by red6 on 4/12/2017.
 */
public class BankApplication {

    public static void main(String[] args) {
        System.out.println("Bank app starts");
        Bank bank = new Bank();
//        Client client1 = bank.addClient("Name1", Gender.FEMALE);
//        client1.addAccount(1, 23.3 );
//        printClient(client1);
//        Client client2 = bank.addClient("Name2", Gender.MALE);
//        client1.addAccount(2, 33.3 );
//        printClient(client2);
        bank.addClientToArray("Name3", Gender.FEMALE);
        bank.getClientsNames();



    }
    public void printBalance() {
        System.out.println("Print balance");
    }

    public static void printClient(Client client) {
        System.out.println("Client name: " + client.getName()+  " Gender: " + client.getGender());
        System.out.println("Acc ID: " + client.getAccount().getId() + " Balance: " + client.getAccount().getBalance());
    }

}
