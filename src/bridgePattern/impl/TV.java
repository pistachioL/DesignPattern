package bridgePattern.impl;

import bridgePattern.ApplianceBridge;

public class TV implements ApplianceBridge {
    @Override
    public void beProduced(String makerName) {
        System.out.println(makerName + "生产电视");
    }
}
