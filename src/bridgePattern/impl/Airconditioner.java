package bridgePattern.impl;

import bridgePattern.ApplianceBridge;

public class Airconditioner implements ApplianceBridge {
    @Override
    public void beProduced(String makerName) {
        System.out.println(makerName + "制造电视机");
    }
}
