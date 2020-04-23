package adapter.voltageClassAdapter;

public class Voltage220 {
    //输出220V电压
    public int output220v(){
        int src = 220;
        System.out.println("电压＝" + src + "伏");
        return src;
    }
}
