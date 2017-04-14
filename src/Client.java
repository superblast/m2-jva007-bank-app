/**
 * Created by red6 on 4/12/2017.
 */
public class Client {
    private String name;
    private Gender gender;
    private Account account;

    public Client(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.account = new Account();
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void addAccount(int id, double balance ) {
        account.setId(id);
        account.setBalance(balance);
    }

    public Account getAccount() {
        return account;

    }
}
