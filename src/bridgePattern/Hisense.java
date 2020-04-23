package bridgePattern;

public class Hisense extends AppliancesMaker {
    @Override
    public void produce() {
        String applianceMaker = "海信生产商生产";
        this.applianceBridge.beProduced(applianceMaker);
    }
}
