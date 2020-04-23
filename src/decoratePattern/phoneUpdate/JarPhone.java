package decoratePattern.phoneUpdate;

public class JarPhone extends SimplePhone{
    public JarPhone(Cellphone cellphone) {
        super(cellphone);
    }

    @Override
    public void receiveCall() {
        super.receiveCall();
        System.out.println("振动提醒");
    }
}
