package statePattern;

public class Account {
    private AccountState state;
    private String owner;
    private double balance = 0;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        this.state = new NormalState(this);
        System.out.println(this.owner + "开户,初始金额为" + balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public void deposit(double amount){
        System.out.println(this.owner + "存款数目" + amount);
        state.deposit(amount);
        System.out.println("目前余额为：" + this.balance);
        state.computeInterest();
        System.out.println("-------------------------------------------");
    }

    public void withdraw(double amount){
        System.out.println(this.owner + "取款数目" + amount);
        state.withdraw(amount);
        System.out.println("目前余额为：" + this.balance);
        state.computeInterest();
        System.out.println("-------------------------------------------");
    }

    public void computeInterest(){
        state.computeInterest();
    }

}
