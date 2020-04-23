package factory.AbsFactoryMethod2.impl;

import factory.AbsFactoryMethod2.AbsSkinFactory;
import factory.AbsFactoryMethod2.Button;
import factory.AbsFactoryMethod2.Combobox;
import factory.AbsFactoryMethod2.TextField;

public class SummerSkinFactory extends AbsSkinFactory {
    @Override
    public Button createButton() {
        return new SummerSkinButton();
    }

    @Override
    public Combobox createCombobox() {
        return new SummerSkinCombobox();
    }

    @Override
    public TextField createTextField() {
        return new SummerSkinTextField();
    }
}
