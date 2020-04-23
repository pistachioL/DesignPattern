package decoratePattern.phoneUpdate;

public class ComplexPhone extends JarPhone {
    public ComplexPhone(Cellphone cellphone) {

        super(cellphone);
    }

    @Override
    public void receiveCall() {
        super.receiveCall();
        System.out.println("闪烁提醒");
    }
}
