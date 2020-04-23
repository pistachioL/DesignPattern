package factory.AbsFactoryMethod2.impl;

import factory.AbsFactoryMethod2.Button;

public class SummerSkinButton extends Button {
    @Override
    public void displayButton() {
        System.out.println("展示浅蓝色按钮");
    }
}
