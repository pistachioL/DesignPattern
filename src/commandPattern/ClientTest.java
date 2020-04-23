package commandPattern;

public class ClientTest {
    public static void main(String[] args) {
        FunctionButton button = new FunctionButton();
        Command command = (Command) XMLUtil.getFactoryBean();
        button.setCommand(command);
        button.click();
    }
}
