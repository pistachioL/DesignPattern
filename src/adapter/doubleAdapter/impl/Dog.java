package adapter.doubleAdapter.impl;

import adapter.doubleAdapter.Idog;

public class Dog implements Idog {
    @Override
    public void catchMouse() {
        System.out.println("我是狗");
    }
}
