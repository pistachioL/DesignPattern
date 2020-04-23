package factory.AbsFactoryMethod;

public class ClientTest {
    public static void main(String[] args){
        AbsDBFactory absDBFactory;
        Connection connection;
        Statement statement;
        absDBFactory = (AbsDBFactory) XMLUtil.getFactoryBean();
        connection = absDBFactory.createConnection();
        statement = absDBFactory.createStatement();
        connection.getConnection();
        statement.writeStatement();
    }
}
