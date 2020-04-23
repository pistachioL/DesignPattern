package decoratePattern.phoneUpdate;

public class SimplePhone extends Cellphone {//原本的手机

    public SimplePhone(Cellphone cellphone) {
        super(cellphone);  //有参则要调用父类的构造函数
    }

    @Override
    public void receiveCall() {
        System.out.println("声音提醒");
    }
}
