package bridgePattern;

//家电制造商
public class Haier extends AppliancesMaker {
    @Override
    public void produce() {
        String applianceMaker = "海尔生产";
        this.applianceBridge.beProduced(applianceMaker);
    }
}
