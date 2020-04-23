package bridgePattern.impl;

import bridgePattern.ApplianceBridge;

public class Refrigerator implements ApplianceBridge {
    @Override
    public void beProduced(String makerName) {
        System.out.println(makerName + "生产冰箱");
    }
}
