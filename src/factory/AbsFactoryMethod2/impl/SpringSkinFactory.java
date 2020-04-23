package factory.AbsFactoryMethod2.impl;

import factory.AbsFactoryMethod2.AbsSkinFactory;
import factory.AbsFactoryMethod2.Button;
import factory.AbsFactoryMethod2.Combobox;
import factory.AbsFactoryMethod2.TextField;

//具体工厂
public class SpringSkinFactory extends AbsSkinFactory {
    @Override
    public Button createButton() {
        return new SpringSkinButton();
    }

    @Override
    public Combobox createCombobox() {
        return new SpringSkinCombobox();
    }

    @Override
    public TextField createTextField() {
        return new SpringSkinTextField();
    }
}
