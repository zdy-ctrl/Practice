package Day06.Bank;
/*      （1）创建一个Customer ，名字叫 Jane Smith, 他有一个账号为1000，余额为2000元，年利率为 1.23％ 的账户。
        （2）对Jane Smith操作。
        存入 100 元，再取出960元。再取出2000元。
        打印出Jane Smith 的基本信息*/
public class TestAccount {
    public static void main(String[] args) {
        //创建一个用户
        Customer customer = new Customer("Jane", "Smith");
        //创建一个账户
        Account account = new Account(1000, 2000, 0.0123);
        //这个账户属于jane Smith
        customer.setAccount(account);
        //对用户进行操作
        Account account1 = customer.getAccount();//获取Jane Smith的账户
        account1.deposit(100);
        System.out.println("余额"+account1.getBalance());
        account1.withdraw(960);
        System.out.println("余额" + account1.getBalance());
        account1.withdraw(2000);
        System.out.println("余额"+account1.getBalance());
    }
}
