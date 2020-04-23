package factory.AbsFactoryMethod2.impl;

import factory.AbsFactoryMethod2.Button;

public class SpringSkinButton extends Button {
    @Override
    public void displayButton() {
        System.out.println("我是春天皮肤，展示浅绿色按钮");
    }
}
