package factory.AbsFactoryMethod2.impl;

import factory.AbsFactoryMethod2.TextField;

public class SummerSkinTextField extends TextField {
    @Override
    public void displayTextField() {
        System.out.println("展示浅蓝色的文本框");
    }
}
