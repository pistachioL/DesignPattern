package bridgePattern;

import bridgePattern.impl.TV;

public class ClientTest {
    public static void main(String[] args){
        ApplianceBridge tv = new TV();
        AppliancesMaker maker = new Haier();
        //maker = (AppliancesMaker)XMLUtil.getBean("Hair");
        maker.setAppliance(tv);
        maker.produce();


    }
}
