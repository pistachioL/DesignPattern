package factory.AbsFactoryMethod2.impl;

import factory.AbsFactoryMethod2.TextField;

public class SpringSkinTextField extends TextField {
    @Override
    public void displayTextField() {
        System.out.println("我是春天皮肤，展示浅绿色文本框");
    }
}
