/**
 * Created by red6 on 4/12/2017.
 */
public class Bank {
    private Client [] clients;
    private int numberOfClients;

    public Bank() {
        clients = new Client [10];
        numberOfClients = 0;
    }

    public int getNumberOfClients() {
        return numberOfClients;
    }

    public Client[] getClents() {
        return clients;
    }

    public void addClientToArray(String name, Gender gender) {
        System.out.println(clients.length);
//        clients[0] = addClient("Name 00", Gender.MALE);
//        clients[1] = addClient("Name 11", Gender.MALE);
        System.out.println(clients[0].getName());
        for (int i = 0; i < clients.length; i++) {
            int numberInitial = numberOfClients;
            if (clients[i].getName()!= null || !clients[i].getName().equals(name) ) {
                clients[i] = addClient(name, gender);
                numberOfClients = numberOfClients + 1;
                System.out.println("New client added, number is " + numberOfClients);
            }
            if (numberInitial == numberOfClients) {
                System.out.println("Impossible to add client, no space");
            }
        }
    }

    public void getClientsNames() {
        for (int i = 0; i < clients.length-1; i++) {
            System.out.println("getClientsNames number is " + i + " name is " + clients[i].getName());
        }
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    public static Client addClient(String name, Gender gender) {
        Client client = new Client(name, gender);;
        return client;






//    public  static Client add

//        for (int i=0; i<=number-1; i++) {
//            clents[i] = new Client
//        }
//        while (number >= 0) {
//            number -=1;
//            System.out.println("Adding client #" + number);
//            clents
//        }

    }


}
