package factory.AbsFactoryMethod;

public class MySQLFactory extends AbsDBFactory {

    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }

    @Override
    public Statement createStatement() {
        return new MySQLStatement();
    }
}
