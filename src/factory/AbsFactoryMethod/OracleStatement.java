package factory.AbsFactoryMethod;

public class OracleStatement extends Statement {
    @Override
    public void writeStatement() {
        System.out.println("写Oracle的SQL语句");
    }
}
