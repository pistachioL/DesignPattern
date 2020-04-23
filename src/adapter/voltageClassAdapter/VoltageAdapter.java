package adapter.voltageClassAdapter;

public class VoltageAdapter extends Voltage220 implements IVoltage5v {
    @Override
    public int output5v() {
        int src = output220v();
        int dst = src/44;
        return dst;
    }
}
