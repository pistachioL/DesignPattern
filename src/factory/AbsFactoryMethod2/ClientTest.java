package factory.AbsFactoryMethod2;

public class ClientTest {
    public static void main(String[] args){
        AbsSkinFactory skinFactory;
        Button button;
        Combobox combobox;
        TextField textField;
        skinFactory = (AbsSkinFactory) XMLUtil.getFactoryBean();
        button = skinFactory.createButton();
        combobox = skinFactory.createCombobox();
        textField = skinFactory.createTextField();

        button.displayButton();
        combobox.displayCombobox();
        textField.displayTextField();
    }




}
