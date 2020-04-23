package factory.AbsFactoryMethod2.impl;

import factory.AbsFactoryMethod2.AbsSkinFactory;
import factory.AbsFactoryMethod2.Button;
import factory.AbsFactoryMethod2.Combobox;
import factory.AbsFactoryMethod2.TextField;

public class AutumnSkinFactory extends AbsSkinFactory {
    @Override
    public Button createButton() {
        return new AutumnSkinButton();
    }

    @Override
    public TextField createTextField() {
        return new AutumnSkinTextField();
    }

    @Override
    public Combobox createCombobox() {
        return new AutumnSkinCombobox();
    }




}
