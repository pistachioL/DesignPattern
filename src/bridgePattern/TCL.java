package bridgePattern;

public class TCL extends AppliancesMaker {
    @Override
    public void produce() {
        String applianceMaker = "TCL生产商";
        this.applianceBridge.beProduced(applianceMaker);
    }
}
