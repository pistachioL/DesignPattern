package adapter.voltageObjectAdapter;

public class VoltageAdapter implements IVoltage5 { //不需要继承
    private Voltage220 voltage220;  //增加被适配对象  关联关系中的聚合
    public VoltageAdapter(Voltage220 voltage220){
        this.voltage220 = voltage220;
    }
    @Override
    public int output5v() {
        int dst = 0;
        if(voltage220 != null){
            int src = voltage220.output220();
            dst = src / 44;
        }
        System.out.println("适配完成后电压为"+dst);
       return dst;

    }

}
