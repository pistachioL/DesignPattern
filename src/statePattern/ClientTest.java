package statePattern;

public class ClientTest {
    public static void main(String[] args) {
        Account account = new Account("小红",0.0);
        account.deposit(1000);
        account.withdraw(3000);
        account.deposit(5000);
        account.withdraw(1000);
        account.withdraw(3000);
        //account.computeInterest();
    }
}
