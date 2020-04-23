package adapter.voltageObjectAdapter;

public class Phone {
    public void charging(IVoltage5 iVoltage5){
        if(iVoltage5.output5v() == 5){
            System.out.println("电压为５ｖ可以充电");
        }
        else if(iVoltage5.output5v() > 5){
            System.out.println("电压大于５ｖ不能充电");
        }
    }
}
