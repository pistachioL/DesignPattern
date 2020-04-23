package factory.AbsFactoryMethod;

public abstract class AbsDBFactory {
    public abstract Connection createConnection();
    public abstract Statement createStatement();
}
