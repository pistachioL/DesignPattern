package factory.AbsFactoryMethod;

public class MySQLStatement extends Statement {
    @Override
    public void writeStatement() {
        System.out.println("写MySQL的SQL语句");
    }
}
