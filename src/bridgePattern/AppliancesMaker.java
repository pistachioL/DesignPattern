package bridgePattern;

public abstract class AppliancesMaker{
    protected ApplianceBridge applianceBridge;
    public void setAppliance(ApplianceBridge applianceBridge){
        this.applianceBridge = applianceBridge;
    }
    public abstract void produce();
}
