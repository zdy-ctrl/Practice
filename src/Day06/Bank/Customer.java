package Day06.Bank;

public class Customer {
    private String firstName; //名字
    private String lastName;  //姓
    private Account account;  //账户
    //构造器
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
