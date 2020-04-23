package adapter.doubleAdapter.impl;

import adapter.doubleAdapter.Icat;

public class Cat implements Icat {

    @Override
    public void cryLikeDog() {
        System.out.println("我是猫");
    }
}
